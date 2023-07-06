package racingcar.service;

import racingcar.NumberGenerator;
import racingcar.domain.CarVO;
import racingcar.domain.Cars;
import racingcar.domain.Round;
import racingcar.dto.RaceRequest;
import racingcar.util.RaceUtil;
import racingcar.domain.Car;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final Cars cars;
    private final Round leftRound;

    private final List<List<CarVO>> raceRecords = new ArrayList<>();

    private Race(Cars cars, int leftRound) {
        this.cars = cars;
        this.leftRound = Round.from(leftRound);
    }

    public static Race of(String[] carNames, int count) {
        Cars cars = Cars.create();
        for (String carName : carNames) {
            cars.add(Car.create(carName));
        }

        return new Race(cars, count);
    }

    public static Race from(RaceRequest raceRequest) {
        return of(raceRequest.getNames(), raceRequest.getTotalRound());
    }

    public List<Car> getCars() {
        return this.cars.getCars();
    }

    public int getLeftRound() {
        return this.leftRound.getRound();
    }

    public void play(NumberGenerator numberGenerator) {
        startRound();
        for (Car car : cars.getCars()) {
            doPlay(numberGenerator, car);
        }
    }

    public List<List<CarVO>> playAll(NumberGenerator numberGenerator) {
        for (int i = 0; i < leftRound.getRound(); i++) {
            play(numberGenerator);
            List<CarVO> list = CarVO.toList(cars.getCars());
            raceRecords.add(list);
        }
        return raceRecords;
    }

    private void doPlay(NumberGenerator numberGenerator, Car car) {
        if (RaceUtil.determineCarMovement(numberGenerator.generate())) {
            car.moveForward();
        }
    }

    public String[] findWinners() {
        return cars.findWinners();
    }

    private void startRound() {
        this.leftRound.decrease();
    }
}
