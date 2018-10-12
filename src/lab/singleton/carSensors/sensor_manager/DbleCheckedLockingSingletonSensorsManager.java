package lab.singleton.carSensors.sensor_manager;

public class DbleCheckedLockingSingletonSensorsManager extends SingletonSensorManager {

    private volatile static DbleCheckedLockingSingletonSensorsManager uniqueInstance;

    public static DbleCheckedLockingSingletonSensorsManager getInstance() {
        if (uniqueInstance == null)  {
            synchronized (DbleCheckedLockingSingletonSensorsManager.class) {
                if(uniqueInstance == null) {
                    uniqueInstance = new DbleCheckedLockingSingletonSensorsManager();
                }
            }
        }
        return uniqueInstance;
    }
}
