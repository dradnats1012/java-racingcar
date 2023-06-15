package racingcar.view;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

class InputTest {

    @Test
    void 도착지_음수_검사() {
        Input input = new Input();

        assertThatThrownBy(() -> input.validateTrial("-1"))
                .isInstanceOf(IllegalArgumentException.class)
                .hasMessage("0이하가 될 수 없습니다.");
    }

    @Test
    void 도착지_문자열_검사() {
        Input input = new Input();

        assertThatThrownBy(() -> input.validateTrial("테스트"))
                .isInstanceOf(RuntimeException.class)
                .hasMessage("숫자가 아닙니다.");
    }
}
