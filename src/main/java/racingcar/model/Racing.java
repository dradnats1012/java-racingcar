package racingcar.model;

import racingcar.RandomNumberGenerator;
import racingcar.message.ConsoleMessage;
import racingcar.view.Input;
import racingcar.view.Output;

import java.util.List;

public class Racing {
    private int goal;
    public List<Car> carList;
    private RandomNumberGenerator randomNumberGenerator;
    private final CarFactory carFactory = new CarFactory();
    Output output = new Output();
    public Racing(List<Car> carList, RandomNumberGenerator randomNumberGenerator){
        this.carList = carList;
        this.randomNumberGenerator = randomNumberGenerator;
    }

    public void exitGame() {
        Output output = new Output();
        System.out.println(ConsoleMessage.GAME_RESULT.getMessage());
        printWinner(carList, output, goal);
    }

    public void play(){
        carFactory.moveAll(randomNumberGenerator, carList);
    }

    public boolean carMoveCheck(List<Car> carList) {
        play();
        for (int index = 0; index < carList.size(); index++) {
            if(checkEnd(carList.get(index), goal) == false){
                output.gameStatus(carList);
                return false;
            }

        }
        output.gameStatus(carList);
        return true;
    }

    public List<Car> inputCarGoal() {
        CarFactory carFactory = new CarFactory();
        Input input = new Input();

        String cars = input.getNames();
        carList = carFactory.makeCar(cars);
        goal = input.setGoal();

        return carList;
    }

    private boolean checkEnd(Car car, int goal) {
        if (car.getPosition() >= goal) {
            return false;
        }
        return true;
    }

    public void printWinner(List<Car> carList, Output output, int goal) {
        System.out.println(output.gameEnd(carList, goal));
    }
}
