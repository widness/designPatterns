package lab.decorator.car;

public class EngineDecorator extends SecurityDecorator {
    public EngineDecorator(Car securityDecorator) {
        super(securityDecorator);
    }

    @Override
    public String getCost() {
        return super.getCost() + "600";
    }

    @Override
    public String getSecurityLevel() {
        return super.getSecurityLevel() + "3";
    }
}
