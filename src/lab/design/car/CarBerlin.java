package lab.design.car;

public class CarBerlin implements Car {
    @Override
    public String getDescription() {
        return "Berlin";
    }

    @Override
    public String getCost() {
        return "2000";
    }

    @Override
    public String getSecurityLevel() {
        return "0";
    }
}
