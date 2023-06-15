package racingcar.view;

import racingcar.message.ConsoleMessage;
import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

import static racingcar.message.ConsoleMessage.OUTPUT_WINNER;

public class Output {
    private List<Car> carList;

    public Output(List<Car> carList) {
        this.carList = carList;
    }

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


    public void exitGame() {
        System.out.println(ConsoleMessage.GAME_RESULT.getMessage());
        gameEnd(carList);
    }

    public void gameEnd(List<Car> carList) {
        System.out.println(printWinner(carList));
    }

    public StringBuilder printWinner(List<Car> carList) {
        int winPosition = checkWinPosition(carList);
        List<String> winner = checkWinner(carList, winPosition);
        StringBuilder endMessage = new StringBuilder();


        for (int index = 0; index < winner.size(); index++) {
            endMessage.append(winner.get(index) + " ");
        }
        endMessage.append(OUTPUT_WINNER.getMessage());

        return endMessage;
    }

    private int checkWinPosition(List<Car> carList) {
        int length = carList.size();
        int winPosition = 0;

        for (int index = 0; index < length; index++) {
            if (carList.get(index).getPosition() > winPosition) {
                winPosition = carList.get(index).getPosition();
            }
        }
        return winPosition;
    }

    private List<String> checkWinner(List<Car> carList, int winPosition) {
        int length = carList.size();
        List<String> winnerList = new ArrayList<>();

        for (int index = 0; index < length; index++) {
            compareState(carList.get(index), winnerList, winPosition);
        }
        return winnerList;
    }

    private List compareState(Car car, List<String> winnerName, int winPosition) {
        if (car.getPosition() == winPosition) {
            winnerName.add(car.getName());
        }
        return winnerName;
    }

}
