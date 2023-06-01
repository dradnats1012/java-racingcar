package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class CarTest {
    @Test
    void 자동차_이름_길이가_5자를_초과하면_예외() {
        assertThatThrownBy(() -> new Car("longname"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름이_공백이면_예외() {
        assertThatThrownBy(() -> new Car(" "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_초기_위치가_0이아니면_예외() {
        Car car = new Car("test");
        assertThat(car.getPosition()).isEqualTo(0);
    }

    @Test
    void 숫자가_4이상이면_전진() {
        Car car = new Car("test");
        car.move(4);
        assertThat(car.getPosition()).isEqualTo(1);
    }

    @Test
    void 숫자가_3이하면_멈춤() {
        Car car = new Car("test");
        car.move(0);
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
