package patterns.observer;

public interface Subject {

	void register(AnimalListener animalListener);

	void notifyObservers();
}
