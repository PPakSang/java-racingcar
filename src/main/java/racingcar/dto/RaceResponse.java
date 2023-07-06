package racingcar.dto;

import racingcar.domain.CarVO;

import java.util.List;

public class RaceResponse {

    private final List<CarVO> cars;

    public RaceResponse(List<CarVO> cars) {
        this.cars = cars;
    }

    public List<CarVO> getCars() {
        return cars;
    }
}
