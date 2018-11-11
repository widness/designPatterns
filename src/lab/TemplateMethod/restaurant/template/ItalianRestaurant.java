package lab.TemplateMethod.restaurant.template;

/**
 * Lab 9
 *
 * @author egs
 */
public class ItalianRestaurant extends Restaurant {

    public ItalianRestaurant(String name) {
        this.name = name;
    }

    @Override
    void preparDessert() {
        System.out.println("Tiramisu.");
    }

    @Override
    void prepareCheese() {
        System.out.println("Adding Parmegiano");
    }

    @Override
    void prepareCoffee() {
        System.out.println("Fine italian espresso");
    }

    @Override
    void prepareMainMenu() {
        System.out.println("Meat and pasta.");
    }

    @Override
    void prepareVegetables() {
        System.out.println("And good zucchini.");
    }

}
