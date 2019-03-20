package BuilderPattern.overseer;

import BuilderPattern.builderImpl.foodsImpl.ChickenBurger;
import BuilderPattern.builderImpl.foodsImpl.Coke;
import BuilderPattern.builderImpl.foodsImpl.Pepsi;
import BuilderPattern.builderImpl.foodsImpl.VegBurger;

public class MealBuilder {

    public Meal prepareVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());

        return meal;
    }

    public Meal prepareNoVegMeal(){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());

        return meal;
    }
}
