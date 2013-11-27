package patterns.observer;

import java.util.ArrayList;
import java.util.List;

public class Food implements Subject {

	private List<AnimalListener> observers = new ArrayList<AnimalListener>();

	@Override
	public void register(AnimalListener animalListener) {
		observers.add(animalListener);
	}

	@Override
	public void notifyObservers() {
		for (AnimalListener animalListener : observers)
			animalListener.update();
	}

}
