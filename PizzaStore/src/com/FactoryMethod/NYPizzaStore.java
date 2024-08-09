package com.FactoryMethod;

public class NYPizzaStore extends PizzaStore{

	@Override
	protected Pizza createPizza(String type) {
		if(type.equals("Cheese")){
			return new NYStyleCheesePizza();
		}
		else {
		return null;
		}
	}
    
}
