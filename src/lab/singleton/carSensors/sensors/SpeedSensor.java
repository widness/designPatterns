package lab.singleton.carSensors.sensors;

/**
 * Lab 6
 * @author egs
 */
public class SpeedSensor implements ISensor {
    
    private static final String DESC = "Speed sensor is running...";
    
    public SpeedSensor() {
    }

    public String getDescription() {
        return DESC;
    }

    public String toString() {
        return this.getDescription();
    }
}
