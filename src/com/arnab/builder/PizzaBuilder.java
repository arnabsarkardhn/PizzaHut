package com.arnab.builder;

import com.arnab.item.Meal;
import com.arnab.pizza.LargeNonVegPizza;
import com.arnab.pizza.LargeVegPizza;
import com.arnab.pizza.NonVegPizza;
import com.arnab.pizza.Pizza;
import com.arnab.pizza.VegPizza;
import com.arnab.toppings.FishToppings;
import com.arnab.toppings.TomatoToppings;
import com.arnab.toppings.Toppings;
import com.arnab.toppings.VegToppings;

public class PizzaBuilder {

	public Meal prepareVegMeal() {
		Meal meal = new Meal();
		VegPizza vegPizza = new LargeVegPizza();
		
		VegToppings vegTopping = new TomatoToppings();
		Toppings nonVegFishToppings = new FishToppings();
		vegPizza.addToppings(vegTopping);
	//	vegPizza.addToppings(nonVegFishToppings);
		
		NonVegPizza nonVegPizza = new LargeNonVegPizza();
		nonVegPizza.addToppings(vegTopping);
		nonVegPizza.addToppings(nonVegFishToppings);
		
		meal.addPizza(vegPizza);

		return meal;
	}
	
	public Meal prepareNonVegMeal() {
		Meal meal = new Meal();

		VegToppings vegTopping = new TomatoToppings();
		Toppings nonVegFishToppings = new FishToppings();
		
		NonVegPizza nonVegPizza = new LargeNonVegPizza();
		nonVegPizza.addToppings(vegTopping);
		nonVegPizza.addToppings(nonVegFishToppings);
		
		meal.addPizza(nonVegPizza);
		
		return meal;
	}
}
