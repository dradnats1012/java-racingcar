package racingcar.model;

import racingcar.message.ConsoleMessage;

public class Car {
    private final String name;
    private int position;
    private static final int MAX_NAME_LENGTH = 5;
    private static final int MOVE_POWER = 4;

    public Car(String name) {
        validateName(name);
        this.name = name;
        this.position = 0;
    }

    private void validateName(String name) {
        if (name.length() > MAX_NAME_LENGTH) {
            throw new IllegalArgumentException(ConsoleMessage.WRONG_NAME_LENGTH.getMessage());
        }
        if (name.isBlank() || name.length() == 0) {
            throw new NullPointerException(ConsoleMessage.BLANK_NAME.getMessage());
        }
    }

    public int getPosition() {
        return position;
    }

    public void move(int power) {
        if (power >= MOVE_POWER) {
            position++;
        }
    }

    public String getName() {
        return name;
    }
}
