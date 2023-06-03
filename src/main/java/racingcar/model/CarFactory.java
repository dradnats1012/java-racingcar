package racingcar.model;

import racingcar.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;

public class CarFactory {

    public List<Car> makeCar(String names) {
        List<Car> carList = new ArrayList<>();
        String[] nameList = split(names);

        for (int index = 0; index < nameList.length; index++) {
            String carName = nameList[index];
            Car car = new Car(carName);
            carList.add(car);
        }
        return carList;
    }

    private String[] split(String names) {
        String[] nameList = names.split(",");

        return nameList;
    }

    public void moveAll(final RandomNumberGenerator generator, List<Car> carList) {
        for (Car car : carList) {
            int power = generator.createRandomNumber();
            car.move(power);
        }
    }
}
