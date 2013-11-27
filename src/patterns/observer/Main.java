package patterns.observer;

/**
 * 
 * Observer One-to-many dependencies. Each subject can have many observers and
 * subject knows its observers. One object (subject) changes state then all
 * dependent objects (observers) are update/notified automatically.
 * 
 * Observer (listener) - object watching some changes. Subject - object which is
 * being watched.
 * 
 * E.g. Button class can be a subject. We are calling button.addActionListener
 * so button knows its listener. Button can have more listeners and if button
 * changes state then can notify listeners (e.g. classes which implements
 * ActionListner) that something changed. Observer has a interface to receive
 * signal from subject.
 * 
 * 
 * 
 * 
 * 
 * @author Sebastian Karsznia
 * 
 */
public class Main {

	public static void main(String[] args) {

		AnimalListener bird = new Bird();
		AnimalListener lion = new Lion();

		Food food = new Food();
		food.register(bird);
		food.register(lion);

		food.notifyObservers();

	}

}
