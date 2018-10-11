package lab.design.onlineShop;

public class WelnessDecorator implements Service {
    protected Service welnessDecorator;

    public WelnessDecorator(Service welnessDecorator) {
        this.welnessDecorator = welnessDecorator;
    }

    @Override
    public String getPrice() {
        return this.welnessDecorator.getPrice();
    }

    @Override
    public String getDescription() {
        return this.welnessDecorator.getDescription();
    }
}
