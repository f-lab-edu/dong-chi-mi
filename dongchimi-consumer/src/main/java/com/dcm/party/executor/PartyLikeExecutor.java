package com.dcm.party.executor;

import com.dcm.party.context.PartyLikeContext;
import com.dcm.party.domain.Party;
import com.dcm.party.domain.repository.PartyRepository;
import com.dcm.party.exception.NotFoundPartyException;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class PartyLikeExecutor {

    private final PartyLikeContext partyLikeContext;
    private final PartyRepository partyRepository;
    private ScheduledExecutorService executorService;

    public PartyLikeExecutor(PartyLikeContext partyLikeContext, PartyRepository partyRepository) {
        this.partyLikeContext = partyLikeContext;
        this.partyRepository = partyRepository;
        this.executorService = Executors.newScheduledThreadPool(1);
        this.executorService.scheduleAtFixedRate(this::executePartyLike, 0, 10, TimeUnit.SECONDS);
    }


    public void executePartyLike() {
        Map<Long, Long> contextMap = partyLikeContext.getAll();
        contextMap.forEach((key, value) -> {
            Party party = validate(key);
            party.setPartyLike(value);
            partyRepository.save(party);
            partyLikeContext.clearPartyLikeRequest(party.getPartyId(), value);
        });
    }

    private Party validate(Long partyId) {
        return partyRepository.findById(partyId)
            .orElseThrow(() -> new NotFoundPartyException(partyId));
    }

}