package lab.decorator.car;

public class AntiSlidingSystemDecorator extends SecurityDecorator {
    public AntiSlidingSystemDecorator(Car securityDecorator) {
        super(securityDecorator);
    }

    @Override
    public String getCost() {
        return super.getCost() + "500";
    }

    @Override
    public String getSecurityLevel() {
        return super.getSecurityLevel() + "1";
    }

}
