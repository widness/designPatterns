package lab.design.onlineShop;

public class HotelDecorator implements Service {
    protected Service hotelDecorator;

    public HotelDecorator(Service hotelDecorator) {
        this.hotelDecorator = hotelDecorator;
    }

    @Override
    public String getPrice() {
        return hotelDecorator.getPrice();
    }

    @Override
    public String getDescription() {
        return hotelDecorator.getDescription() + " An hotel: ";
    }
}
