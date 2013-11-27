package casting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

	
	public static void main(String[] args){
		
		Main main = new Main();
		List<Animal> animals;
		List<Bird> birds;
//		animals = main.getAnimals();
		birds = main.getBirds();
		
		animals = new ArrayList<Animal>(birds);
		System.out.println(Arrays.toString(animals.toArray()));
	}
	
	public List<Bird> getBirds() {
		List<Bird> birds = new ArrayList<Bird>();
		Bird bird = new Bird();
		bird.setName("Bird 1");
		birds.add(bird);
		return birds;
	}
	
	public List<Animal> getAnimals() {
		List<Animal> animals = new ArrayList<Animal>();
		animals.add(new Animal());
		return animals;
	}
	
}
