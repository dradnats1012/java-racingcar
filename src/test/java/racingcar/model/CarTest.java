package racingcar.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;


class CarTest {
    @Test
    void 자동차_이름길이_확인(){
        assertThatThrownBy(() -> new Car("longname"))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 자동차_이름공백_확인(){
        assertThatThrownBy(() -> new Car(" "))
                .isInstanceOf(IllegalArgumentException.class);
    }

    @Test
    void 초기위치_확인(){
        Car car = new Car("pobi");
        assertThat(car.getPosition()).isEqualTo(0);
    }
}
