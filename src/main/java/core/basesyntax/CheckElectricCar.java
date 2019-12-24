package core.basesyntax;

import java.util.function.Predicate;

/**
 * <p>Имплементируйте необходимый функциональный интерфейс и его метод, который реализует проверку
 * установлен ли на авто EngineType.ELECTRIC. Метод должен принимать Car.</p>
 */
public class CheckElectricCar implements Predicate<Car> {
    @Override
    public boolean test(Car car) {
        Predicate<Car> engineType =
                car1 -> car.getEngine().getEngineType()
                        .equals(EngineType.ELECTRIC);
        return engineType.test(car);
    }
}
