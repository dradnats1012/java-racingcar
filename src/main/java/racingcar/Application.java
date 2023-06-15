package racingcar;

import racingcar.controller.Controller;
import racingcar.model.Car;
import racingcar.model.Racing;

import java.util.List;

public class Application {
    public static List<Car> carList;
    public static RandomNumberGenerator randomNumberGenerator;

    public static void main(String[] args) {
        Controller controller = new Controller();
        controller.run();
        //controller.gamePlay();
    }
}
