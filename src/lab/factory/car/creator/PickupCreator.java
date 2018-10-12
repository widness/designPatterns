package lab.factory.car.creator;


import lab.factory.car.cars.Car;
import lab.factory.car.cars.Pickup;

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
