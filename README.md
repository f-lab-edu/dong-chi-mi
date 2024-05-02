## 소개
![동치미logo](https://github.com/f-lab-edu/dong-chi-mi/assets/51324045/f7cc15e4-8592-4eab-a3ec-15c346fe5ec9)

### 동치미란?
동치미는 '동네 친구들과 미팅(Meeting)'의 줄임말로,
<br> 동네에서 취미가 같은 사람들끼리 모임을 만들어 함께 취미 생활을 할 수 있도록 돕는 서비스입니다.
<br> 이 플랫폼을 통해 사용자는 자신의 취미를 공유하고, 같은 관심사를 가진 이웃과 연결될 수 있습니다.
<br /> 동치미 로고는 서로 다른 사람들 하나의 취미를 함께 하기 위해 한 곳에 모여 이루어진다는 의미를 가지도록 디자인 되었습니다.

## 멀티 모듈 구조

### api 모듈
- 이 모듈은 각 서비스의 API 인터페이스를 정의합니다.
- 컨트롤러와 API 관련 DTO(Data Transfer Object)만 포함하여 service layer 와의 의존성을 최소화합니다.

### reactive 모듈
- 실시간 기능을 처리하는 모듈로, 채팅 및 알림 기능을 구현합니다.
- 비동기 처리와 이벤트 기반 아키텍처 사용을 중점적으로 다룹니다.

### consumer 모듈
- Message를 구독하는 Consumer들을 구현하는 모듈입니다.
- Redis, Kafaka 등 외부에서 전달 받은 Message를 활용

## 아키텍처 구성도
![20240427_구성도](https://github.com/f-lab-edu/dong-chi-mi/assets/51324045/4039dffc-c8ea-4526-9ca4-e86d624ad245)


## 백엔드 기술
![백엔드2](https://github.com/f-lab-edu/dong-chi-mi/assets/51324045/ebe18f8f-9643-46e1-96b0-4b321df5538c)









## 개발자
| Backend |
| ------- |
| <img src="https://github.com/stc9606.png" width="100" height="100"> |
| [노승철](https://github.com/stc9606) |
