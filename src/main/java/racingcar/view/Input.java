package racingcar.view;

import racingcar.message.ConsoleMessage;

import java.io.Console;
import java.util.Scanner;

public class Input {

    Scanner sc = new Scanner(System.in);
    public String getNames() {
        System.out.println(ConsoleMessage.INPUT_CAR_NAME.getMessage());
        String name = sc.next();

        return name;
    }

    public void setGoal(){
        System.out.println(ConsoleMessage.INPUT_GOAL_NUMBER.getMessage());
        validateGoal(sc.nextLine());
    }
    public void validateGoal(String goal){
        validateInteger(goal);
        validateMinus(goal);
    }

    private void validateMinus(String goal){
        if (Integer.parseInt(goal) <= 0){
            throw new IllegalArgumentException("0이하가 될 수 없습니다.");
        }
    }

    private void validateInteger(String goal){
        try {
            Integer.parseInt(goal);
        } catch (NumberFormatException e) {
            throw new RuntimeException("숫자가 아닙니다.");
        }
    }
}
