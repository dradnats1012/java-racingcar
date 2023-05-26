package racingcar.model;

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
}
