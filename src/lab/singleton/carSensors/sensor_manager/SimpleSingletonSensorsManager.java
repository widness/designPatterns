package lab.singleton.carSensors.sensor_manager;

public class SimpleSingletonSensorsManager extends SingletonSensorManager {

    private static SimpleSingletonSensorsManager instance;

    public static SimpleSingletonSensorsManager getInstance(){

        if(instance == null) {
            instance = new SimpleSingletonSensorsManager() {};
        }
        return instance;
    }

}
