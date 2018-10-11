package lab.design.onlineShop;

public class RoomDecorator extends HotelDecorator {
    public RoomDecorator(Service hotelDecorator) {
        super(hotelDecorator);
    }

    @Override
    public String getPrice() {
        return super.getPrice() + " 300";
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " With room";
    }
}
