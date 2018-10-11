package lab.design.car;

public class CarBreak implements Car {
    @Override
    public String getDescription() {
        return "Break";
    }

    @Override
    public String getCost() {
        return "3000";
    }

    @Override
    public String getSecurityLevel() {
        return "0";
    }

}
