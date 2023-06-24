package racingcar.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

class RandomNumberGeneratorTest {
    @Test
    void 랜덤값_범위_확인() {
        CarRandomNumberGenerator randomNumberGenerator = new CarRandomNumberGenerator();
        int randomNumber = randomNumberGenerator.createRandomNumber();

        assertTrue(0 <= randomNumber && randomNumber <= 9);
    }

}
