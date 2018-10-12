package lab.decorator.onlineShop;

public class SkiPassDecorator implements Service {
    protected Service skiPassDecorator;

    public SkiPassDecorator(Service skiPassDecorator) {
        this.skiPassDecorator = skiPassDecorator;
    }

    @Override
    public String getPrice() {
        return this.skiPassDecorator.getPrice();
    }

    @Override
    public String getDescription() {
        return this.skiPassDecorator.getDescription();
    }
}
