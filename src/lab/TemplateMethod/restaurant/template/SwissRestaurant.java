package lab.TemplateMethod.restaurant.template;

/**
 * Lab 9
 *
 * @author egs
 */
public class SwissRestaurant extends Restaurant {

    public SwissRestaurant(String name) {
        this.name = name;
    }

    @Override
    void preparDessert() {
        System.out.println("Meringue.");
    }

    @Override
    void prepareCheese() {
        System.out.println("Gruyère.");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Nespresso.");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Papet vaudois");
    }

    @Override
    void prepareVegetables() {
        System.out.println("Salade");
    }

}
