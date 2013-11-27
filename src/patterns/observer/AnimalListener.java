package patterns.observer;


/**
 * Observer.
 * 
 * 
 * @author Sebastian Karsznia
 *
 */
public interface AnimalListener {
	
	/**
	 * Update all observers which implements AnimalListner when food (subject) changed - food appears.
	 */
	void update();
	
}
