package racingcar.view;

import org.junit.jupiter.api.Test;
import racingcar.model.Car;
import racingcar.model.CarFactory;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

class OutputTest {
    @Test
    void 상태_출력_테스트() {
        CarFactory carFactory = new CarFactory();
        Output output = new Output();
        List<Car> carList = carFactory.makeCar("pobi,crong");

        carList.get(0).move(4);
        assertThat(carList.get(0).getPosition()).isEqualTo(1);

        carList.get(1).move(2);
        assertThat(carList.get(1).getPosition()).isEqualTo(0);

        output.gameStatus(carList);     // 어떻게 출력된거 검사할지?

    }

    @Test
    void 승자_검사_테스트() {
        CarFactory carFactory = new CarFactory();
        Output output = new Output();
        List<Car> carList = carFactory.makeCar("pobi,crong");

        carList.get(0).move(4);


        String expected = "pobi 가 최종 우승했습니다";
        String actual = String.valueOf(output.gameEnd(carList, 1));
        ; // 예상되는 결과를 가져오는 메서드를 가정합니다.

        assertEquals(expected, actual);
    }

    @Test
    void 공동_승자_검사_테스트() {
        CarFactory carFactory = new CarFactory();
        Output output = new Output();
        List<Car> carList = carFactory.makeCar("pobi,crong");

        carList.get(0).move(4);
        carList.get(1).move(4);

        String expected = "pobi crong 가 최종 우승했습니다";
        String actual = String.valueOf(output.gameEnd(carList, 1));

        assertEquals(expected, actual);
    }
}