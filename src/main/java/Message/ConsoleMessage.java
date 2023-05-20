package Message;

public enum ConsoleMessage {
    INPUT_CAR_NAME("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분)."),
    INPUT_GOAL_NUMBER("시도할 횟수는 몇회인가요?"),
    GAME_RESULT("실행 결과"),
    OUTPUT_WINNER("가 최종 우승했습니다");

    private final String message;

    ConsoleMessage(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}
