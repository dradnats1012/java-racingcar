package racingcar.model;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CarFactory {
    public List<Car> makeCar(String names) {
        return Arrays.stream(names.split(","))
                .map(Car::new)
                .collect(Collectors.toList());
    }
}
