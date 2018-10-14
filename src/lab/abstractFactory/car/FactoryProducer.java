package lab.abstractFactory.car;

import lab.abstractFactory.car.cars.CarFactory;
import lab.abstractFactory.car.creator.CarCreatorFactory;

public class FactoryProducer {

    public AbstractFactory getFactory(String factory){
        if(factory.equalsIgnoreCase("CAR")){
            return new CarFactory();
        } else {
            return new CarCreatorFactory();
        }
    }
}
