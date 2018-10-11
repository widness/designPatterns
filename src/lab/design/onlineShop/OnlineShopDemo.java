package lab.design.onlineShop;

public class OnlineShopDemo {
    public static void main(String[] args) {
        Service c1 = new DefaultService();
        c1 = new FlatDecorator(c1);
        c1 = new RoomDecorator(c1);
        c1 = new WelnessDecorator(c1);

        System.out.println(c1.getPrice());
        System.out.println(c1.getDescription());
    }
}
