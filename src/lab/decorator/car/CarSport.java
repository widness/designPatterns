package lab.decorator.car;

public class CarSport implements Car {
    @Override
    public String getDescription() {
        return "Sport";
    }

    @Override
    public String getCost() {
        return "1000";
    }

    @Override
    public String getSecurityLevel() {
        return "0";
    }
}
