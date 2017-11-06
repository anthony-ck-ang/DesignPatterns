package com.anthonyang;

public class ExcitedToBePetOwner {

	public static void main(String[] args) {
		Animal pet = AnimalFarm.getAnimal(AnimalType.DOG);
		pet.makeOwnerHeartMelt();

		Animal pet2 = AnimalFarm.getAnimal(AnimalType.CAT);
		pet2.makeOwnerHeartMelt();

		Animal pet3 = AnimalFarm.getAnimal(AnimalType.RABBIT);
		pet3.makeOwnerHeartMelt();

		// Integrate Singleton pattern
		Animal singleton = AnimalFarm.getAnimal(AnimalType.SINGLETON_OBJECT);
		singleton.makeOwnerHeartMelt();

		// same singleton object
		Animal singleton2 = AnimalFarm.getAnimal(AnimalType.SINGLETON_OBJECT);
		singleton2.makeOwnerHeartMelt();

	}

}
