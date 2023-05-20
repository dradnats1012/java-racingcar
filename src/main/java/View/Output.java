package View;

import Model.Car;

import java.util.ArrayList;

import static Message.ConsoleMessage.OUTPUT_WINNER;

public class Output {

    public void gameStatus(ArrayList<Car> carList) {    // 게임의 진행상황 출력
        int length = carList.size();

        for (int index = 0; index < length; index++) {
            System.out.print(carList.get(index).getName() + " : ");
            printState(carList.get(index));
        }
    }

    private void printState(Car car) {  // 현재 상태만큼 출력 -> 배열의 인덱스 하나만

        for (int index = 0; index < carState(car); index++) {
            System.out.print("-");

        }
        System.out.println();

    }

    private int carState(Car car) {     // 현재 상태길이 반환
        int stateLength = car.getState();
        return stateLength;
    }

    public void gameEnd(ArrayList<Car> carList, int arrival) {
        ArrayList<String> winner = checkWinner(carList, arrival);


        for (int index = 0; index < winner.size(); index++) {
            System.out.print(winner.get(index) + " ");
        }
        System.out.println(OUTPUT_WINNER.getMessage());
    }

    private ArrayList<String> checkWinner(ArrayList<Car> carList, int arrival) {
        int length = carList.size();
        ArrayList<String> winnerName = new ArrayList<>();

        for (int index = 0; index < length; index++) {
            compareState(carList.get(index), arrival, winnerName);
        }
        return winnerName;
    }

    private ArrayList compareState(Car car, int arrival, ArrayList<String> winnerName) {

        if (car.getState() == arrival) {
            winnerName.add(car.getName());
        }

        return winnerName;
    }
}
