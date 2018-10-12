package lab.decorator.car;

public class AirbagDecorator extends SecurityDecorator {
    public AirbagDecorator(Car securityDecorator) {
        super(securityDecorator);
    }

    @Override
    public String getCost() {
        return  " 300";
    }

    @Override
    public String getSecurityLevel() {
        return super.getSecurityLevel() + "1";
    }
}
