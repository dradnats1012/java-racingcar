package racingcar.view;

import racingcar.message.ConsoleMessage;
import racingcar.model.Car;
import racingcar.model.CarFactory;

import java.util.List;
import java.util.Scanner;

public class Input {
    private static final Scanner sc = new Scanner(System.in);
    private List<Car> carList;

    public List<Car> inputCar() {
        CarFactory carFactory = new CarFactory();
        String cars = getNames();
        carList = carFactory.makeCar(cars);

        return carList;
    }

    public String getNames() {
        System.out.println(ConsoleMessage.INPUT_CAR_NAME.getMessage());
        return sc.nextLine();
    }

    public int setTrial() {
        System.out.println(ConsoleMessage.INPUT_GOAL_NUMBER.getMessage());
        String trial = sc.nextLine();
        validateTrial(trial);

        return Integer.parseInt(trial);
    }

    public void validateTrial(String trial) {
        validateInteger(trial);
        validateMinus(trial);
    }

    private void validateInteger(String trial) {
        try {
            Integer.parseInt(trial);
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException(ConsoleMessage.NOT_NUMBER.getMessage());
        }
    }

    private void validateMinus(String trial) {
        if (Integer.parseInt(trial) <= 0) {
            throw new IllegalArgumentException(ConsoleMessage.MINUS_NUMBER.getMessage());
        }
    }
}
