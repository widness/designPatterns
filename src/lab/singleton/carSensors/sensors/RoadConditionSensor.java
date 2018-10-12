package lab.singleton.carSensors.sensors;

/**
 * Lab 6
 * @author egs
 */
public class RoadConditionSensor implements ISensor {
    
    private static final String DESC = "Road condition sensor is running...";
    
    public RoadConditionSensor() {
    }

    public String getDescription() {
        return DESC;
    }

    public String toString() {
        return this.getDescription();
    }
}
