package com.arnab.pizza;

import java.util.List;

import com.arnab.toppings.Toppings;

public abstract class NonVegPizza implements Pizza{

	public abstract String name();
	public abstract int price();
	public abstract <T extends Toppings> void addToppings(T toppings);
	public abstract List<Toppings> getToppings();
}
