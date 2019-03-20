package BuilderPattern.user;

import BuilderPattern.overseer.Meal;
import BuilderPattern.overseer.MealBuilder;

public class BuilderPatternDemo {
    public static void main(String[] args) {
        MealBuilder mealBuilder = new MealBuilder();

        Meal vegMeal = mealBuilder.prepareVegMeal();
        System.out.println("Veg Meal");
        vegMeal.showItem();
        System.out.println("Total Fee: " + vegMeal.getCost());

        Meal noVegMeal = mealBuilder.prepareNoVegMeal();
        System.out.println("No Veg Meal");
        noVegMeal.showItem();
        System.out.println("Total Fee: " + noVegMeal.getCost());
    }
}
