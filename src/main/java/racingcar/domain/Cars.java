package racingcar.domain;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Cars {

    private final List<Car> cars;

    private Cars() {
        this.cars = new ArrayList<>();
    }

    public static Cars create() {
        return new Cars();
    }

    public List<Car> getCars() {
        return Collections.unmodifiableList(this.cars);
    }

    public void add(Car car) {
        this.cars.add(car);
    }

    public String[] findWinners() {
        int maxPosition = 0;
        for (Car car : cars) {
            maxPosition = Math.max(car.getPosition(), maxPosition);
        }

        List<String> names = new ArrayList<>();
        for (Car car : cars) {
            if (maxPosition == car.getPosition()) {
                names.add(car.getName());
            }
        }

        return names.toArray(new String[0]);
    }
}
