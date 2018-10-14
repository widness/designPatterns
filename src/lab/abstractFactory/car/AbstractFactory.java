package lab.abstractFactory.car;

import lab.abstractFactory.car.cars.Car;
import lab.abstractFactory.car.creator.CarCreator;

public abstract class AbstractFactory {
    protected abstract Car getCar(String carType);
    protected abstract CarCreator getCreator(String creatorType);
}
