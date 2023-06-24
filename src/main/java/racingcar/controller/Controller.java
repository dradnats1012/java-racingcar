package racingcar.controller;

import racingcar.message.ConsoleMessage;
import racingcar.model.Car;
import racingcar.model.CarRandomNumberGenerator;
import racingcar.model.Racing;
import racingcar.view.Input;
import racingcar.view.Output;

import java.util.List;

public class Controller {
    private List<Car> carList;
    private Racing racing;
    private Input input;
    private Output output;

    public Controller() {
        this.input = new Input();
        this.output = new Output();
    }

    public void run() {
        carList = input.inputCar();
        int tryCount = input.setTrial();
        racing = new Racing(new CarRandomNumberGenerator(), carList, tryCount);

        System.out.println(ConsoleMessage.GAME_RESULT.getMessage());
        while (!racing.isEnd()) {
            racing.play();
            output.gameStatus(carList);
        }
        output.exitGame(carList);
    }
}
