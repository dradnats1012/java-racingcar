package racingcar.controller;

import racingcar.model.Car;
import racingcar.model.CarFactory;
import racingcar.model.RandomNumberGenerator;
import racingcar.view.Input;
import racingcar.view.Output;

import java.util.List;

public class Controller{
    public void gamePlay(){
        CarFactory carFactory = new CarFactory();
        Input input = new Input();
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        Output output = new Output();

        List<Car> carList = carFactory.makeCar(input.getNames());

        for(int index = 0; index < carList.size(); index++){
            carList.get(index).move(randomNumberGenerator.createRandomNumber());
        }
        output.gameStatus(carList);
    }

}
