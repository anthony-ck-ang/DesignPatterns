package com.anthonyang;

public class AnimalFarm {
	public static Animal getAnimal(AnimalType animalType){
		
		switch(animalType){
		case DOG:
			return new Dog();
		case CAT:
			return new Cat();
		case RABBIT:
			return new Cat();
		default:
			return null;
		}
	}
}
