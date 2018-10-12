package lab.decorator.car;

public class ColorDecorator implements Car {

    protected Car carColor;

    public ColorDecorator(Car carColor) {
        this.carColor = carColor;
    }

    @Override
    public String getDescription() {
        return this.carColor.getDescription() + " pimped color";
    }

    @Override
    public String getCost() {
        return this.carColor.getCost();
    }

    @Override
    public String getSecurityLevel() {
        return this.carColor.getSecurityLevel();
    }
}
