package com.arnab.pizza;

import java.util.ArrayList;
import java.util.List;
import com.arnab.toppings.Toppings;

public class LargeNonVegPizza extends NonVegPizza {

	List<Toppings> toppingType;
	
	public LargeNonVegPizza() {
		toppingType = new ArrayList<>();
	}
	
	@Override
	public String name() {
		return "Large Non Veg Pizza";
	}

	@Override
	public int price() {
		return 100;
	}

	@Override
	public <T extends Toppings> void addToppings(T topping) {
		toppingType.add(topping);
	}
	
	@Override
	public List<Toppings> getToppings() {
		return toppingType;
	}


}
