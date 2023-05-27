package racingcar.controller;

import racingcar.message.ConsoleMessage;
import racingcar.model.Car;
import racingcar.model.CarFactory;
import racingcar.model.RandomNumberGenerator;
import racingcar.view.Input;
import racingcar.view.Output;

import java.util.List;

public class Controller {
    public static boolean GameFlag = true;
    private static int goal;
    private static List<Car> carList;

    public void gamePlay() {
        Output output = new Output();

        inputCarGoal();

        while (GameFlag) {
            carMoveCheck();
            output.gameStatus(carList);
            System.out.println();
        }
        exitGame();
    }

    private void exitGame() {
        Output output = new Output();

        System.out.println(ConsoleMessage.GAME_RESULT.getMessage());
        printWinner(carList, output, goal);
    }

    private void carMoveCheck() {
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        for (int index = 0; index < carList.size(); index++) {
            carList.get(index).move(randomNumberGenerator.createRandomNumber());
            checkEnd(carList.get(index), goal);
        }
    }

    private void inputCarGoal() {
        CarFactory carFactory = new CarFactory();
        Input input = new Input();

        String cars = input.getNames();
        carList = carFactory.makeCar(cars);
        goal = input.setGoal();
    }

    private void checkEnd(Car car, int goal) {
        if (car.getPosition() == goal) {
            GameFlag = false;
        }
    }

    private void printWinner(List<Car> carList, Output output, int goal) {
        System.out.println(output.gameEnd(carList, goal));
    }
}
