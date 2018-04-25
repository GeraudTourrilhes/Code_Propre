package ex3;

import java.util.List;

public class Zone {

	protected List<Animal> animals;

	
	public void addAnimal(Animal animal) {
		animals.add(animal);
	}
	
	public void afficherListeAnimaux(){
		for (Animal animale: animals){
			System.out.println(animale.getNomAnimal());
		}
	}
	
	
}