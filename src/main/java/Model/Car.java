package Model;

public class Car {
    private String name;
    private int state;
    private final int Car_Name_Length_Limit = 5;

    public Car(String name) {
        this.name = name;
        this.state = 0;
        checkName(name);
    }

    public String getName() {
        return name;
    }

    public int getState() {
        return state;
    }

    public void move() {
        int randomNumber = createRandomNumber();

        if (4 <= randomNumber && randomNumber <= 9) {
            state++;
        }
        if (0 <= randomNumber && randomNumber <= 3) {
            return;
        }
    }

    private int createRandomNumber() {
        double num = Math.random();
        int randomNumber = (int) (num * 10);

        return randomNumber;
    }

    private void checkName(String name){
        checkLength(name);
    }

    private void checkLength(String name){
        if(name.length() > Car_Name_Length_Limit){
            throw new IllegalArgumentException("자동차의 이름은 5글자 이하만 가능합니다!");
        }
    }
}
