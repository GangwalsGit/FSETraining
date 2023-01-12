package com.question3;

public class TestMain {

	public static void main(String[] args) {
    Bird bird= new Bird();
    System.out.println("Calling Bird methods with bird Instance");
    bird.eat();
    bird.sleep();
    bird.fly();
    
    WildAnimal wildAnimal= new WildAnimal();
    System.out.println("Calling Wild Animal with Animal Instance");
    wildAnimal.eat();
    wildAnimal.sleep();
    wildAnimal.kill();

    System.out.println("Calling Bird method with animal instance");
    Animal birdAnimal=new Bird();
    birdAnimal.eat();
    birdAnimal.sleep();

    System.out.println("Calling WildAnimal method with animal instance");
    Animal wildAni=new WildAnimal();
    wildAni.eat();
    wildAni.sleep();   

	}
}