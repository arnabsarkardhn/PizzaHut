package com.arnab.pizza;

import java.util.ArrayList;
import java.util.List;
import com.arnab.toppings.Toppings;
import com.arnab.toppings.VegToppings;

public class LargeVegPizza extends VegPizza{

	private List<Toppings> toppingType;
	
	public LargeVegPizza() {
		toppingType = new ArrayList<>();
	}
	
	@Override
	public String name() {
		return "Large Veg Pizza";
	}

	@Override
	public int price() {
		return 50;
	}

	@Override
	public <T extends VegToppings> void addToppings(T topping) {
		toppingType.add(topping);
	}

	@Override
	public List<Toppings> getToppings() {
		return toppingType;
	}

			
}
