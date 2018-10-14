package lab.abstractFactory.car.creator;


import lab.abstractFactory.car.cars.Car;
import lab.abstractFactory.car.cars.Coupe;

/**
 * Lab 4
 * @author egs
 */
public class CoupeCreator extends CarCreator
{
    @Override
    protected Car createCar() {
		return new Coupe();
	}
}
