package racingcar.model;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

class RandomNumberGeneratorTest {
    @Test
    void 랜덤값_범위_확인(){
        RandomNumberGenerator randomNumberGenerator = new RandomNumberGenerator();
        int randomNumber = randomNumberGenerator.createRandomNumber();

        assertTrue(0 <= randomNumber && randomNumber <= 9);
    }


}