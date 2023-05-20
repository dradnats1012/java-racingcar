package Model;

import java.util.ArrayList;

public class Name {

    private String[] split(String names) {
        String[] nameList = names.split(",");

        return nameList;
    }

    public ArrayList<Car> makeCar(String names) {
        ArrayList<Car> carList = new ArrayList<>();
        String[] nameList = split(names);

        for (int index = 0; index < nameList.length; index++) {
            String carName = nameList[index];
            Car car = new Car(carName);
            carList.add(car);
        }

        return carList;
    }


}
