package lab.factory.car.creator;


import lab.factory.car.cars.Car;
import lab.factory.car.cars.Coupe;

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
