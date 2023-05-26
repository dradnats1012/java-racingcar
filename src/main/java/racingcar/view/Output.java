package racingcar.view;

import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

import static racingcar.message.ConsoleMessage.OUTPUT_WINNER;

public class Output {
    public void gameStatus(List<Car> carList) {
        int length = carList.size();

        for (int index = 0; index < length; index++) {
            System.out.print(carList.get(index).getName() + " : ");
            printPosition(carList.get(index));
        }
    }

    private void printPosition(Car car) {

        for (int index = 0; index < carState(car); index++) {
            System.out.print("-");
        }
        System.out.println();
    }

    private int carState(Car car) {
        int stateLength = car.getPosition();
        return stateLength;
    }


}
