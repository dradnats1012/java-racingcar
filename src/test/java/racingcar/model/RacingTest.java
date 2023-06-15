package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import racingcar.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class RacingTest {
    //private final List<String> carNames = List.of("박스터", "포르쉐", "소나타")
    private final String carNames = "박스터, 포르쉐, 소나타";

    @Test
    void 플레이를_호출하면_모든_자동차_위치_1_증가() {
        int tryCount = 1;
        CarFactory carFactory = new CarFactory();
        List<Car> carList = carFactory.makeCar(carNames);

        Racing racing = new Racing( new AlwaysMoveGenerator(), carList, tryCount);
        racing.play();
        List<Integer> positions = new ArrayList<>();

        for (Car car : carList) {
            positions.add(car.getPosition());
        }

        Assertions.assertThat(positions).containsOnly(1);
    }

    @Test
    void 플레이를_호출하면_모든_자동차_위치_멈춤() {
        /*int tryCount = 0;
        CarFactory carFactory = new CarFactory();
        List<Car> carList = carFactory.makeCar(carNames);

        Racing racing = new Racing( new NeverMoveGenerator(), carList, tryCount);
        racing.play();
        List<Integer> positions = new ArrayList<>();

        //Assertions.assertThat(carList).hasSize(3);

        for (Car car : carList) {
            positions.add(car.getPosition());
        }

        Assertions.assertThat(positions).containsOnly(tryCount);*/
        int tryCount = 1;
        CarFactory carFactory = new CarFactory();
        List<Car> carList = carFactory.makeCar(carNames);

        Racing racing = new Racing( new NeverMoveGenerator(), carList, tryCount);
        racing.play();
        List<Integer> positions = new ArrayList<>();

        for (Car car : carList) {
            positions.add(car.getPosition());
        }

        Assertions.assertThat(positions).containsOnly(0);
    }
    private static class AlwaysMoveGenerator implements RandomNumberGenerator {

        @Override
        public int createRandomNumber() {
            return 4;
        }

    }

    private static class NeverMoveGenerator implements RandomNumberGenerator {

        @Override
        public int createRandomNumber() {
            return 0;
        }

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RacingTest that = (RacingTest) o;
        return Objects.equals(carNames, that.carNames);
    }

    @Override
    public int hashCode() {
        return Objects.hash(carNames);
    }
}
