package general.classes;

/**
 * - Think about class not as a structure, but as a responsibility. 1 class - 1
 * responsibility.
 * 
 * - can be only one public class per source file - name of file has to be same
 * as name on a public class - in file can be more then 1 nonpublic class -
 * import applied to a whole file - modifier strictfp - for class or methods,
 * never for variables. Marking a class as strictfp means that any method code
 * in the class will conform to the IEEE 754 standard rules for floating points.
 * 
 * - Abstract modifier - never can be instantiated. For inheritance. So Why
 * class without objects? We do not need to create a object of class Animal, but
 * only gather the common features of bird to be attached to concrete class of
 * Animal like Bird. Creation of instance of abstract class - compile error:
 * AnotherClass.java:7: class Car is an abstract class. It can't be
 * instantiated.
 * 
 * Class has to be abstract if one of it's method is abstract.
 * 
 * Class can not be abstract and final at once.
 * 
 * 
 * 
 * 
 * 
 * @author Sebastian Karsznia
 * 
 */
public abstract class Animal {

	/**
	 * Abstract method has to be implemented in subclass.
	 */
	public abstract void eat();

	public void walk() {

	}

}
