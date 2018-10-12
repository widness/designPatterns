package lab.decorator.onlineShop;

public class FlatDecorator extends HotelDecorator {
    public FlatDecorator(Service hotelDecorator) {
        super(hotelDecorator);
    }

    @Override
    public String getPrice() {
        return super.getPrice() + " 1000";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " with Flat";
    }
}
