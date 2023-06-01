package racingcar.view;

import racingcar.message.ConsoleMessage;

import java.util.Scanner;

public class Input {

    private static Scanner sc = new Scanner(System.in);

    public String getNames() {
        System.out.println(ConsoleMessage.INPUT_CAR_NAME.getMessage());
        String name = sc.nextLine();

        return name;
    }

    public int setGoal() {
        System.out.println(ConsoleMessage.INPUT_GOAL_NUMBER.getMessage());
        String goal = sc.nextLine();
        validateGoal(goal);

        return Integer.parseInt(goal);
    }

    public void validateGoal(String goal) {
        validateInteger(goal);
        validateMinus(goal);
    }

    private void validateMinus(String goal) {
        if (Integer.parseInt(goal) <= 0) {
            throw new IllegalArgumentException(ConsoleMessage.MINUS_NUMBER.getMessage());
        }
    }

    private void validateInteger(String goal) {
        try {
            Integer.parseInt(goal);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ConsoleMessage.NOT_NUMBER.getMessage());
        }
    }
}
