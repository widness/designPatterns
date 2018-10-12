package lab.factory.car;

import lab.factory.car.cars.*;
import lab.factory.car.creator.CarCreator;
import lab.factory.car.creator.MinivanCreator;
import lab.factory.car.creator.PickupCreator;
import lab.factory.car.creator.CoupeCreator;

/**
 * Lab 4
 * @author egs
 */
public class Program {
	public static void main(String[] args) {

        CarCreator coupeCreator = new CoupeCreator();
        CarCreator minivanCreator = new MinivanCreator();
        CarCreator pickupCreator = new PickupCreator();

        Car c1 = coupeCreator.orderCar("red");
        System.out.println("Car " + c1.getName() + " " + c1.getColor() + " has been ordered.");

        Car c2 = minivanCreator.orderCar("red");
        System.out.println("Car " + c2.getName() + " " + c2.getColor() + " has been ordered.");

        Car c3 = pickupCreator.orderCar("red");
        System.out.println("Car " + c3.getName() + " " + c3.getColor() + " has been ordered.");

	}
}
