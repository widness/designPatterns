package lab.abstractFactory.car.creator;

import lab.abstractFactory.car.AbstractFactory;
import lab.abstractFactory.car.cars.Car;

public class CarCreatorFactory extends AbstractFactory {
    @Override
    protected Car getCar(String carType) {
        return null;
    }

    @Override
    protected CarCreator getCreator(String creatorType) {
        if(creatorType.equalsIgnoreCase("COUPE")) {
            return new CoupeCreator();
        } else if(creatorType.equalsIgnoreCase("MINIVAN") ) {
            return new MinivanCreator();
        } else {
            return new PickupCreator();
        }
    }
}
