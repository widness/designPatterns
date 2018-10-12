package lab.singleton.carSensors.sensor_manager;

public class EagerSingletonSensorsManager extends SingletonSensorManager {
    private static EagerSingletonSensorsManager uniqueInstance = new EagerSingletonSensorsManager();

    public static EagerSingletonSensorsManager getInstance() {
        return uniqueInstance;
    }
}
