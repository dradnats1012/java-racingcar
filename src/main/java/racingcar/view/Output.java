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
        System.out.println("");
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

    public StringBuilder gameEnd(List<Car> carList, int goal) {
        List<String> winner = checkWinner(carList, goal);
        StringBuilder endMessage = new StringBuilder();

        for (int index = 0; index < winner.size(); index++) {
            endMessage.append(winner.get(index) + " ");
        }
        endMessage.append(OUTPUT_WINNER.getMessage());

        return endMessage;
    }

    private List<String> checkWinner(List<Car> carList, int arrival) {
        int length = carList.size();
        List<String> winnerName = new ArrayList<>();

        for (int index = 0; index < length; index++) {
            compareState(carList.get(index), arrival, winnerName);
        }
        return winnerName;
    }

    private List compareState(Car car, int arrival, List<String> winnerName) {
        if (car.getPosition() == arrival) {
            winnerName.add(car.getName());
        }
        return winnerName;
    }

}
