package patterns.facade;


/**
 * 
 * FACADE 
 * "Provide a unified interface to a set of interfaces in a subsystem.
 * Facade define s a higher-level interface that
 * makes the subsystem easier to use."
 * 
 * 
 * We would like to expose for external usage only eat and walk without rest methods.
 * Of course we have to provide special class (service) for our API, but interface is ready for use.
 * 
 * 
 * WHEN:
 * - new, easier way to interact with a system
 * - in particular way interaction with system
 * 
 * It reduces the number of objects that client has to deal with.
 * It gathers some part of functionalities without touching all things by a client..
 * To hide, encapsulated out system. Treated in this case as a black box.
 * It makes no sense to teach everybody how to use the whole subsystem functionality. Better to expose for them
 * clear and clean API with only things which can be used from outside.
 * In case of changing subsystem. Only facade methods have to be changed.
 * 
 * 
 * 
 * @author Sebastian Karsznia
 *
 */
public interface LiveAbility {

	void eat();
	
	void walk();
	
}
