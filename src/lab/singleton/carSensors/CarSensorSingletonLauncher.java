package lab.singleton.carSensors;

import lab.singleton.carSensors.sensor_manager.*;
import lab.singleton.carSensors.sensors.RoadConditionSensor;
import lab.singleton.carSensors.sensors.SpeedSensor;
import lab.singleton.carSensors.sensors.TemperatureSensor;

/**
 * Lab 6
 * @author egs
 */
public class CarSensorSingletonLauncher {
    
    public CarSensorSingletonLauncher() {
    }
    
    public static void main(String[] args) {
        CarSensorSingletonLauncher launcher = new CarSensorSingletonLauncher();
        launcher.launch();
    }
    
    public void launch() {
        this.test(SimpleSingletonSensorsManager.getInstance());
        this.test(SynchSingletonSensorsManager.getInstance());
        this.test(EagerSingletonSensorsManager.getInstance());
        this.test(DbleCheckedLockingSingletonSensorsManager.getInstance());
    }

    private void test(SingletonSensorManager manager) {
        manager.addSensor(new TemperatureSensor());
        manager.addSensor(new SpeedSensor());
        manager.addSensor(new RoadConditionSensor());
        manager.printState();
    }


}
