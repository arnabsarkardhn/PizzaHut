package com.arnab.pizza;

import java.util.List;

import com.arnab.toppings.Toppings;
import com.arnab.toppings.VegToppings;

public abstract class VegPizza implements Pizza {

	public abstract String name();
	public abstract int price();
	public abstract <T extends VegToppings> void addToppings(T topping);
	public abstract List<Toppings> getToppings();
}
