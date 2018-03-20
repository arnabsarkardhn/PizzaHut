package com.arnab.builder;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.arnab.item.Meal;

public class PizzaClient {

	public static void main(String[] args) {

		PizzaBuilder pizzaBuilder = new PizzaBuilder();
		Meal vegMeal = pizzaBuilder.prepareVegMeal();
		vegMeal.showItems();
		
		List<Number> list = new ArrayList<Number>();
		Collections.addAll(list, new Integer(1), new Integer(2));
		
	}

}
