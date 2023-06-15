package racingcar.controller;

import racingcar.message.ConsoleMessage;
import racingcar.model.Car;
import racingcar.model.CarFactory;
import racingcar.model.CarRandomNumberGenerator;
import racingcar.model.Racing;
import racingcar.view.Input;
import racingcar.view.Output;

import java.util.List;

public class Controller {
    public List<Car> carList;
    public Racing racing;
    public Input input;
    public Output output;
    public CarFactory carFactory;

    public Controller() {
        this.input = new Input();
        this.carFactory = new CarFactory();

        carList = input.inputCar();
        this.output = new Output(carList);
        int tryCount = input.setTrial();

        this.racing = new Racing( new CarRandomNumberGenerator(), carList, tryCount);
    }

    public void run() {
        System.out.println(ConsoleMessage.GAME_RESULT.getMessage());
        while (!racing.isEnd()) {
            racing.play();
            output.gameStatus(carList);
        }
        output.exitGame();
    }
}
