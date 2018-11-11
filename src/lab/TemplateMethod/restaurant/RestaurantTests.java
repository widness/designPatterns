package lab.TemplateMethod.restaurant;

import lab.TemplateMethod.restaurant.template.ItalianRestaurant;
import lab.TemplateMethod.restaurant.template.Restaurant;
import lab.TemplateMethod.restaurant.template.SwissRestaurant;

/**
 * Lab 9
 *
 * @author egs
 */
public class RestaurantTests {

    /**
     * @param args
     */
    public static void main(String[] args) {
        Restaurant ilGolossone = new ItalianRestaurant("Il Golossone - Zürich");
        Restaurant leVieuxChalet = new SwissRestaurant("Le Vieux Chalet - Gruyères");
        ilGolossone.prepareDinner();
        leVieuxChalet.prepareDinner();
    }
}
