package lab.abstractFactory.car.creator;

import lab.abstractFactory.car.cars.Car;

/**
 * Lab 4
 * @author egs
 */
public abstract class CarCreator {

    public Car orderCar(String color) {
        Car car = createCar();

        car.installEngine();
        car.addExtras();
        car.paint(color);

        return car;
    }

	protected abstract Car createCar();

}
