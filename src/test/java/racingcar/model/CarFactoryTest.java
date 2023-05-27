package racingcar.model;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class CarFactoryTest {
    @Test
    void 자동차_이름_분리_테스트() {
        List<Car> carList;

        CarFactory carFactory = new CarFactory();
        carList = carFactory.makeCar("pobi,crong,honux");

        assertThat(carList.get(0).getName() == "pobi");
        assertThat(carList.get(1).getName() == "crong");
        assertThat(carList.get(2).getName() == "honux");
    }


}
