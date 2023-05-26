# java-racingcar

자동차 경주 미션 저장소
- 
- 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
- 각 자동차에 이름을 부여할 수 있다. 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분하며 이름은 5자 이하만 가능하다.
- 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
- 전진하는 조건은 0에서 9 사이에서 random 값을 구한 후 random 값이 4 이상일 경우 전진하고, 3 이하의 값이면 멈춘다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한 명 이상일 수 있다.

**실행 결과**

- 위 요구사항에 따라 3대의 자동차가 5번 움직였을 경우 프로그램을 실행한 결과는 다음과 같다.

```
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.

```

### 자동차
- [x] 위치를 가진다
  - [x] 초기 위치 0
- [x] 전진 또는 멈출 수 있다
  - [x] 4 이상일 경우 위치가 1 증가한다.
  - [x] 3 이하의 값이면 멈춘다.
- [x] 이름을 가진다.
  - [x] 이름이 5자를 초과하면 예외
  - [x] 이름이 null이나 공백이면 예외

### 자동차 게임
- [X] 0에서 9 사이에서 random 값을 가진다.
- [ ] 시도 횟수만큼 게임이 진행된다.
- [ ] 우승자를 판별한다.
- [ ] 우승자가 나올때까지 게임을 반복한다.

### 입력
- [ ] 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- [ ] 사용자는 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.

### 출력
- [ ] 우승자를 출력한다.
- [ ] 매 라운드마다 이름 : 이동거리 를 출력한다.
