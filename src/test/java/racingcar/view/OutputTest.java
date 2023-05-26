package racingcar.view;

import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.CarFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

class OutputTest {
    @Test
    void 테스트(){
        CarFactory carFactory = new CarFactory();
        Output output = new Output();
        List<Car> carList = carFactory.makeCar("pobi,crong");

        carList.get(0).move(4);
        assertThat(carList.get(0).getPosition()).isEqualTo(1);

        carList.get(1).move(2);
        assertThat(carList.get(1).getPosition()).isEqualTo(0);

        output.gameStatus(carList);     // 어떻게 출력된거 검사할지?
    }
}
