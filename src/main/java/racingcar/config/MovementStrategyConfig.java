package racingcar.config;

import racingcar.domain.movement.MovementStrategy;
import racingcar.domain.movement.RandomMovementStrategy;

public class MovementStrategyConfig {

    public static MovementStrategy getMovementStrategy() {
        return new RandomMovementStrategy();
    }
}