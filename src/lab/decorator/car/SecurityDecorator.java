package lab.decorator.car;

public abstract class SecurityDecorator implements Car {
    protected Car securityDecorator;

    public SecurityDecorator(Car securityDecorator) {
        this.securityDecorator = securityDecorator;
    }

    @Override
    public String getDescription() {
        return securityDecorator.getDescription();
    }

    @Override
    public String getCost() {
        return securityDecorator.getCost();
    }

    @Override
    public String getSecurityLevel() {
        return securityDecorator.getSecurityLevel();
    }
}
