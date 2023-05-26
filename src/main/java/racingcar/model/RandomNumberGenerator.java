package racingcar.model;

public class RandomNumberGenerator {

    public RandomNumberGenerator(){
        validateRandomNumber(createRandomNumber());
    }
    public int createRandomNumber() {
        double num = Math.random();
        int randomNumber = (int) (num * 10);


        return randomNumber;
    }

    private void validateRandomNumber(int randomNumber){
        if(0 > randomNumber && randomNumber > 9){
            throw new IllegalArgumentException();
        }
    }

}
