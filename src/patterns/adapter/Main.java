package patterns.adapter;

/**
 * 
 * ADAPTER
 * 
 * - Goal - convert one interface to another interface (that client expects). or
 * if system is proper but has improper interface for client usage. - System has
 * to provide a wrapper for existing feature. - Client from external point of
 * view can treat my internal objects (like line,point,square) as one same type
 * (shape). It's easier to exchange the client. In case of adding new shape
 * (like circle) no need to do changes in clients. Same interface - through the
 * Shape. - If the circle exists but doesn't fit to the shape needs. We can
 * create our own circle and put this existing one (aggregate) it inside our
 * circle and do a wrapper. - Shape encapsulates our present shapes.
 * 
 * - Adapter vs Facade In both cases we have preexisting class(es) and proper
 * interface class is needed. Both are wrappers from this high poing of view. In
 * facade I do not have an interface which is needed in adapter. Polymorphic
 * behavior rather for adpater usage. In Facade main goal is to simplify the
 * interface. In adapter rather to convert existing interface. Facade rather
 * hides many classes as one point of control but adapter rather hides one
 * class. Facade SIMPLIFY interface, adapter CONVERT interface.
 * 
 * 
 * 
 * 
 * 
 * 
 * @author Sebastian Karsznia
 * 
 * 
 */
public class Main {

	public static void main(String[] args) {

		System.out.println("Adapter Pattern");

	}

}
