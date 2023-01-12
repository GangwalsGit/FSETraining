package com.question3;

public class WildAnimal extends Animal{

	@Override
	void eat() {
		System.out.println("Wild Animal eats green plants & trees for food, whereas some others eat meat.");
	}

	@Override
	void sleep() {
		System.out.println("called Wild Animal sleep method");
		
	}
	
	public void kill() {
		System.out.println("called Wild Animal kill method");
		
	}

}
