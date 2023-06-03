package racingcar.model;

import racingcar.RandomNumberGenerator;

public class CarRandomNumberGenerator implements RandomNumberGenerator {

    public CarRandomNumberGenerator() {
        validateRandomNumber(createRandomNumber());
    }

    public int createRandomNumber() {
        return (int) (Math.random() * 10);
    }

    private void validateRandomNumber(int randomNumber) {
        if (0 > randomNumber || randomNumber > 9) {
            throw new IllegalArgumentException();
        }
    }
}
