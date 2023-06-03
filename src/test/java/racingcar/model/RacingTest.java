package racingcar.model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racingcar.RandomNumberGenerator;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static org.assertj.core.api.Assertions.assertThat;

class RacingTest {
    //private final List<String> carNames = List.of("박스터", "포르쉐", "소나타")
    private final String carNames = "박스터, 포르쉐, 소나타";

    @Test
    void 플레이를_호출하면_모든_자동차_위치_1_증가() {
        int tryCount = 1;
        CarFactory carFactory = new CarFactory();
        List<Car> carList = carFactory.makeCar(carNames);

        Racing racing = new Racing(carList, new AlwaysMoveGenerator());
        racing.play();
        List<Integer> positions = new ArrayList<>();

        for(int index = 0; index < carList.size(); index++){
            positions.add(carList.get(index).getPosition());
        }

        Assertions.assertThat(positions.get(0)).isEqualTo(tryCount);
        Assertions.assertThat(positions.get(1)).isEqualTo(tryCount);
        Assertions.assertThat(positions.get(2)).isEqualTo(tryCount);
    }

    @Test
    void 플레이를_호출하면_모든_자동차_위치_멈춤() {
        int tryCount = 0;
        CarFactory carFactory = new CarFactory();
        List<Car> carList = carFactory.makeCar(carNames);

        Racing racing = new Racing(carList, new NeverMoveGenerator());
        racing.play();
        List<Integer> positions = new ArrayList<>();


        System.out.println(carList.get(0).getPosition());
        System.out.println(carList.get(1).getPosition());
        System.out.println(carList.get(2).getPosition());

        for(int index = 0; index < carList.size(); index++){
            positions.add(carList.get(index).getPosition());
        }

        Assertions.assertThat(positions.get(0)).isEqualTo(tryCount);
        Assertions.assertThat(positions.get(1)).isEqualTo(tryCount);
        Assertions.assertThat(positions.get(2)).isEqualTo(tryCount);
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
}
