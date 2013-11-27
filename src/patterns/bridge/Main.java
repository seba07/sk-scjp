package patterns.bridge;

/**
 * 
 * BRIDGE
 * 
 * Separate abstraction from implementation. Abstraction = how things are
 * related one another conceptually. Each animal (dog,bird) has its own eating
 * mechanism.
 * 
 * Problem: + each animal has to have separate class. + redundancy of eating
 * mechanisms inside each animal class
 * 
 * Bridge - independently usage of abstraction and concrete implementations.
 * Separation means that we can change abstraction without changes in
 * implementation and vice versa.
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

		/** I can as I wish create any animal with any eating mechanism. **/

		new Bird(new Eating1());
		new Bird(new Eating2());
		new Dog(new Eating1());
		new Dog(new Eating2());
	}

}
