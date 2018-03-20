package com.arnab.item;

import java.util.ArrayList;
import java.util.List;
import com.arnab.pizza.Pizza;

public class Meal {

	List<Pizza> pizzas = new ArrayList<Pizza>();
	
	public void addPizza(Pizza pizza) {
		pizzas.add(pizza);
	}
	
	public int prices() {
		int total = 0;
		for(Pizza pizza : pizzas) {
			total += pizza.price();
		}
		return total;
	}
	
	public void showItems() {
		for(Pizza pizza : pizzas) {
			System.out.println("Item name: " + pizza.name());
		}
	}
}
