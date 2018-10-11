package lab.design.onlineShop;

public class DefaultService implements Service {
    @Override
    public String getPrice() {
        return "New Services price: ";
    }

    @Override
    public String getDescription() {
        return "New Services description: ";
    }
}
