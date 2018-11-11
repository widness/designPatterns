package lab.TemplateMethod.example;

public abstract class CaffeineBeverage {

    final void prepareRecipe() {
        CaffeineBeverage.boilWater();
        brew();
        CaffeineBeverage.pourInCup();
        addCondiments();
    }

    abstract void brew();

    abstract void addCondiments();

    static void boilWater() {
        System.out.println("Boiling water");
    }

    static void pourInCup() {
        System.out.println("Pouring into cup");
    }
}
