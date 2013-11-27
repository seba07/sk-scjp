package patterns.bridge;


/**
 * Client can use only Animal (abstraction) to invoke eat of created object like dog,bird etc.
 * 
 * 
 * @author Sebastian Karsznia
 *
 */
public abstract class Animal {

	private IEating eating;

	public Animal(IEating eating) {
		super();
		this.eating = eating;
	}
	
	
	
}
