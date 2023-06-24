package racingcar.view;

import racingcar.message.ConsoleMessage;
import racingcar.model.Car;

import java.util.ArrayList;
import java.util.List;

import static racingcar.message.ConsoleMessage.OUTPUT_WINNER;

public class Output {

    public void gameStatus(List<Car> carList) {
        int length = carList.size();

        for (Car car : carList) {
            System.out.print(car.getName() + " : ");
            printPosition(car);
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
        return car.getPosition();
    }


    public void exitGame(List<Car> carList) {
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


        for (String s : winner) {
            endMessage.append(s).append(" ");
        }
        endMessage.append(OUTPUT_WINNER.getMessage());

        return endMessage;
    }

    private int checkWinPosition(List<Car> carList) {
        int length = carList.size();
        int winPosition = 0;

        for (Car car : carList) {
            if (car.getPosition() > winPosition) {
                winPosition = car.getPosition();
            }
        }
        return winPosition;
    }

    private List<String> checkWinner(List<Car> carList, int winPosition) {
        int length = carList.size();
        List<String> winnerList = new ArrayList<>();

        for (Car car : carList) {
            compareState(car, winnerList, winPosition);
        }
        return winnerList;
    }

    private void compareState(Car car, List<String> winnerName, int winPosition) {
        if (car.getPosition() == winPosition) {
            winnerName.add(car.getName());
        }
    }

}
