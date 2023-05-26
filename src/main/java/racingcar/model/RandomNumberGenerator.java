package racingcar.model;

public class RandomNumberGenerator {

    public int createRandomNumber() {
        double num = Math.random();
        int randomNumber = (int) (num * 10);
        validateRandomNumber(randomNumber);

        return randomNumber;
    }

    private void validateRandomNumber(int randomNumber){
        if(0 > randomNumber && randomNumber > 9){
            throw new IllegalArgumentException();
        }
    }

}
