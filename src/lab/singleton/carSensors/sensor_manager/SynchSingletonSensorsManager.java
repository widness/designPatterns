package lab.singleton.carSensors.sensor_manager;

public class SynchSingletonSensorsManager extends SingletonSensorManager {

    private static SimpleSingletonSensorsManager instance;

    public static synchronized SimpleSingletonSensorsManager getInstance(){

        if(instance == null) {
            instance = new SimpleSingletonSensorsManager() {};
        }
        return instance;
    }

}
