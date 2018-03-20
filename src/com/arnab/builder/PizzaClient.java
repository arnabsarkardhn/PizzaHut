package com.arnab.builder;

import com.arnab.item.Meal;

public class PizzaClient {

	public static void main(String[] args) {

		PizzaBuilder pizzaBuilder = new PizzaBuilder();
		Meal vegMeal = pizzaBuilder.prepareVegMeal();
		vegMeal.showItems();
		
		Meal nonVegMeal = pizzaBuilder.prepareNonVegMeal();
		nonVegMeal.showItems();
		
		
	}

}
