package lab.decorator.car;

public class BreakingSystemDecorator extends SecurityDecorator {
    public BreakingSystemDecorator(Car securityDecorator) {
        super(securityDecorator);
    }

    @Override
    public String getCost() {
        return super.getCost();
    }

    @Override
    public String getSecurityLevel() {
        return super.getSecurityLevel();
    }
}
