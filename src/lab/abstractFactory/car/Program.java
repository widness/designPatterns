package lab.abstractFactory.car;

import lab.abstractFactory.car.cars.Car;
import lab.abstractFactory.car.creator.*;

/**
 * Lab 4
 * @author egs
 */
public class Program {
	public static void main(String[] args) {

	    FactoryProducer fp = new FactoryProducer();
        AbstractFactory carCreatorFactory = fp.getFactory("CARFACTORY");
        AbstractFactory cacFactory = fp.getFactory("CAR");

        CarCreator coupeCreator = carCreatorFactory.getCreator("COUPE");
        CarCreator minivanCreator = carCreatorFactory.getCreator("MINIVAN");
        CarCreator pickupCreator = carCreatorFactory.getCreator("PICKUP");

        Car c1 = coupeCreator.orderCar("red");
        System.out.println("Car " + c1.getName() + " " + c1.getColor() + " has been ordered.");

        Car c2 = minivanCreator.orderCar("red");
        System.out.println("Car " + c2.getName() + " " + c2.getColor() + " has been ordered.");

        Car c3 = pickupCreator.orderCar("red");
        System.out.println("Car " + c3.getName() + " " + c3.getColor() + " has been ordered.");

	}
}
