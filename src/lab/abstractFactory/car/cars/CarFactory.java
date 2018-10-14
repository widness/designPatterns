package lab.abstractFactory.car.cars;

import lab.abstractFactory.car.AbstractFactory;
import lab.abstractFactory.car.creator.CarCreator;

public class CarFactory extends AbstractFactory {
    @Override
    protected Car getCar(String carType) {
        if(carType.equalsIgnoreCase("COUPE")) {
            return new Coupe();
        } else if(carType.equalsIgnoreCase("MINIVAN") ) {
            return new Minivan();
        } else {
            return new Pickup();
        }
    }

    @Override
    protected CarCreator getCreator(String creatorType) {
        return null;
    }
}
