package com.question3;
public class Bird extends Animal {

	@Override
	void eat() {
		System.out.println("Birds eats insects, grubs, larvae, and worms ");	
	}

	@Override
	void sleep() {
		System.out.println("Birds sleeps in night");	
	}
	
	public void fly() {
		System.out.println("Birds can fly");	
	}
}
