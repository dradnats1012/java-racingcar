package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.CarRandomNumberGenerator;
import racingcar.model.Racing;
import racingcar.view.Output;

import java.util.List;

public class Controller {
    public List<Car> carList;
    public Racing racing;

    public Controller(Racing racing) {
        this.racing = new Racing(carList, new CarRandomNumberGenerator());
    }

    public void gamePlay() {
        carList = racing.inputCarGoal();

        while (racing.carMoveCheck(carList)) {
        }
        racing.exitGame();
    }
}
