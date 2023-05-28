package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class CarTest {
    @Test
    void 자동차_이름길이_확인() {
        assertThatThrownBy(() -> new Car("longname"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름공백_확인() {
        assertThatThrownBy(() -> new Car(" "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 초기위치_확인() {
        Car car = new Car("test");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 전진_확인() {
        Car car = new Car("test");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 멈춤_확인() {
        Car car = new Car("test");
        car.move(0);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
