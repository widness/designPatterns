package lab.abstractFactory.car.creator;

import lab.abstractFactory.car.cars.Car;
import lab.abstractFactory.car.cars.Minivan;

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
