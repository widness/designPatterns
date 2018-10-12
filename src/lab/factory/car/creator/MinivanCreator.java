package lab.factory.car.creator;

import lab.factory.car.cars.Car;
import lab.factory.car.cars.Minivan;

/**
 * Lab 4
 * @author egs
 */
public class MinivanCreator extends CarCreator
{
    @Override
	protected Car createCar() {
		return new Minivan() ;
	}
}
