package racingcar.model;

public class RandomNumberGenerator {

    public int createRandomNumber() {
        double num = Math.random();
        int randomNumber = (int) (num * 10);

        return randomNumber;
    }

}
