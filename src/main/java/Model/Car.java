package Model;

public class Car {
    private String name;
    private int state;

    public Car(String name) {
        this.name = name;
        this.state = 0;
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

}
