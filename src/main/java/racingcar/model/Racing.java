package racingcar.model;

import racingcar.RandomNumberGenerator;

import java.util.List;

public class Racing {
    private final RandomNumberGenerator numberGenerator;
    private final Trial tryCount;

    private List<Car> carList;

    public Racing(final RandomNumberGenerator numberGenerator, final List<Car> cars, final int tryCount) {
        this.tryCount = new Trial(tryCount);
        this.numberGenerator = numberGenerator;
        this.carList = cars;
    }

    public void carMove(final RandomNumberGenerator generator) {
        for (Car car : carList) {
            int power = generator.createRandomNumber();
            car.move(power);
        }
    }

    public void play() {
        carMove(numberGenerator);
        tryCount.decreaseCount();
    }

    public boolean isEnd() {
        return tryCount.isEnd();
    }

}
