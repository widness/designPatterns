package lab.abstractFactory.car.creator;


import lab.abstractFactory.car.cars.Car;
import lab.abstractFactory.car.cars.Pickup;

/**
 * Lab 4
 * @author egs
 */
public class PickupCreator extends CarCreator
{
    @Override
	protected Car createCar() {
		return new Pickup();
	}
}
