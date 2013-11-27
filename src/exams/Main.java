package exams;

import java.text.DateFormat;

import java.util.Calendar;

import java.util.Collections;

import java.util.HashSet;

import java.util.LinkedList;

import java.util.Locale;

/**
 * 
 * EXAM
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author Sebastian Karsznia 
 * 
 */

public class Main

{

	/**
	 * 
	 * Result:
	 * 
	 * will print 4 without any problem
	 */

	public void test1()

	{

		HashSet<Object> hs = new HashSet<Object>();

		hs.add("Sting");

		hs.add(new Integer(1));

		System.out.println(hs.size());

	}

	/**
	 * 
	 * Result:
	 * 
	 * java.lang.ExceptionInInitializerError
	 * 
	 * Caused by: java.lang.NullPointerException
	 */

	public void test2()

	{

		/*
		 * Put in the different class
		 * 
		 * static int x[];
		 * 
		 * static {
		 * 
		 * x[0] = 1;
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * 11, because in while is ++i, so 10+1
	 */

	public void test3()

	{

		int i = 10;

		while (++i <= 10)

		{

			i++;

		}

		System.out.print(i);

	}

	/**
	 * 
	 * Result:
	 * 
	 * if Data class without implements Serializable
	 * 
	 * java.io.NotSerializableException: exams.Main$Data
	 * 
	 * 
	 */

	public void test4()

	{

		/*
		 * 
		 * try
		 * 
		 * {
		 * 
		 * Data data = new Data();
		 * 
		 * FileOutputStream fos = new FileOutputStream( "data.dat" );
		 * 
		 * ObjectOutputStream oos = new ObjectOutputStream( fos );
		 * 
		 * oos.writeObject( data );
		 * 
		 * oos.close();
		 * 
		 * }
		 * 
		 * catch ( Exception ex )
		 * 
		 * {
		 * 
		 * ex.printStackTrace();
		 * 
		 * }
		 * 
		 * 
		 * 
		 * class Data
		 * 
		 * {
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * Only by Main.State
	 */

	public void test5()

	{

		/*
		 * Put in class
		 * 
		 * public enum State{ACTIVE, DELETED, INACTIVE}
		 * 
		 * Main.State state = Main.State.INACTIVE;
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * An exception is thrown at runtime.
	 * 
	 * Exception in thread "main" java.lang.ClassCastException:
	 * java.lang.Integer cannot be cast to java.lang.Double
	 */

	public void test6()

	{

		/*
		 * 
		 * TrickyNum<Integer> a = new TrickyNum<Integer>(new Integer(1));
		 * 
		 * System.out.print(a.getDouble());
		 * 
		 * 
		 * 
		 * class TrickyNum<X extends Object> {
		 * 
		 * 
		 * 
		 * private X x;
		 * 
		 * 
		 * 
		 * public TrickyNum(X x) {
		 * 
		 * this.x = x;
		 * 
		 * }
		 * 
		 * 
		 * 
		 * private double getDouble() {
		 * 
		 * return ((Double) x).doubleValue();
		 * 
		 * }
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * Constructor always triggers super() in the beginning.
	 * 
	 * printed value: "a b c"
	 */

	public void test7()

	{

		/*
		 * 
		 * new Small3();
		 * 
		 * 
		 * 
		 * class Small {
		 * 
		 * public Small() {
		 * 
		 * System.out.print("a ");
		 * 
		 * }
		 * 
		 * }
		 * 
		 * class Small2 extends Small {
		 * 
		 * public Small2() {
		 * 
		 * System.out.print("b ");
		 * 
		 * }
		 * 
		 * }
		 * 
		 * class Small3 extends Small2 {
		 * 
		 * public Small3() {
		 * 
		 * System.out.print("c ");
		 * 
		 * }
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Static method can not be declared in the private class! because:
	 * 
	 * Error:
	 * "The method staticMethod cannot be declared static; static methods can only be declared in a static or top level type."
	 * 
	 * 
	 * 
	 * Result:
	 * 
	 * - A public static method in class Z can be called by a subclass of Z
	 * without explicitly referencing the class Z.???
	 * 
	 * No
	 * 
	 * - A final method in class Z can be abstract if and only if Z is abstract.
	 * 
	 * Yes, class has to be abstract if any of method is abstract!
	 */

	public void test8()

	{

	}

	/**
	 * 
	 * Result:
	 * 
	 * Compilation error - int has no appropriate method!
	 */

	public void test9()

	{

		/*
		 * 
		 * short shortRoom = 1;
		 * 
		 * int intRoom = 2;
		 * 
		 * book( shortRoom );
		 * 
		 * book( intRoom );
		 * 
		 * 
		 * 
		 * public static void book ( short a )
		 * 
		 * {
		 * 
		 * System.out.print( "short " );
		 * 
		 * }
		 * 
		 * public static void book ( Short a )
		 * 
		 * {
		 * 
		 * System.out.print( "SHORT " );
		 * 
		 * }
		 * 
		 * public static void book ( Long a )
		 * 
		 * {
		 * 
		 * System.out.print( "LONG " );
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * Exception in thread "main" java.lang.NullPointerException
	 * 
	 * why? because | still checks second operand where s.lenght gives NPE.
	 */

	private void test10()

	{

		/*
		 * 
		 * if (isEmpty(null)) {
		 * 
		 * System.out.print("empty ");
		 * 
		 * } else {
		 * 
		 * System.out.print("not_empty ");
		 * 
		 * }
		 * 
		 * 
		 * 
		 * public static boolean isEmpty(String s) {
		 * 
		 * return (s == null | s.length() == 0);
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * Compilation fails. X class does not know doubleValue().
	 */

	private void test11()

	{

		/*
		 * 
		 * class TrickyNum<X extends Object> {
		 * 
		 * 
		 * 
		 * private X x;
		 * 
		 * 
		 * 
		 * private double getDouble() {
		 * 
		 * return x.doubleValue();
		 * 
		 * }
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * During sort:
	 * 
	 * Error:
	 * "java.lang.ClassCastException: exams.Main$HashTest cannot be cast to java.lang.Comparable"
	 */

	private void test12()

	{

		/*
		 * 
		 * HashTest h1 = new HashTest( "2" );
		 * 
		 * String s1 = new String( "1" );
		 * 
		 * Object arr[] = new Object[ 2 ];
		 * 
		 * arr[ 0 ] = h1;
		 * 
		 * arr[ 1 ] = s1;
		 * 
		 * Arrays.sort( arr );
		 * 
		 * for ( Object o : arr )
		 * 
		 * {
		 * 
		 * System.out.print( o + " " );
		 * 
		 * }
		 * 
		 * 
		 * 
		 * public class HashTest
		 * 
		 * {
		 * 
		 * private String str;
		 * 
		 * public HashTest ( String str )
		 * 
		 * {
		 * 
		 * this.str = str;
		 * 
		 * }
		 * 
		 * @Override
		 * 
		 * public String toString ()
		 * 
		 * {
		 * 
		 * return this.str;
		 * 
		 * }
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * Runtime exception, error:
	 * "java.lang.ClassCastException: exams.Main$Car cannot be cast to exams.Main$Bike"
	 */

	private void test13()

	{

		/*
		 * 
		 * Vehicle v = new Car();
		 * 
		 * Bike b = (Bike) v;
		 * 
		 * 
		 * 
		 * v.printSound();
		 * 
		 * b.printSound();
		 * 
		 * 
		 * 
		 * class Vehicle {
		 * 
		 * public void printSound() {
		 * 
		 * System.out.print("vehicle");
		 * 
		 * }
		 * 
		 * }
		 * 
		 * class Car extends Vehicle {
		 * 
		 * public void printSound() {
		 * 
		 * System.out.print("car");
		 * 
		 * }
		 * 
		 * }
		 * 
		 * class Bike extends Vehicle {
		 * 
		 * public void printSound() {
		 * 
		 * System.out.print("bike");
		 * 
		 * }
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * NullPointerException has to be above Exception handler catch block! is
	 * unreachable! Compilation errro!
	 */

	private void test14()

	{

		/*
		 * 
		 * try {
		 * 
		 * String arr[] = new String[10];
		 * 
		 * arr = null;
		 * 
		 * arr[0] = "one";
		 * 
		 * System.out.print(arr[0]);
		 * 
		 * } catch(Exception ex) {
		 * 
		 * System.out.print("exception");
		 * 
		 * } catch(NullPointerException nex) {
		 * 
		 * System.out.print("null pointer exception");
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * printed: July 1, 2009
	 */

	private void test15()

	{

		DateFormat df = DateFormat.getDateInstance(DateFormat.LONG, Locale.US);

		Calendar c = Calendar.getInstance();

		c.set(Calendar.YEAR, 2009);

		c.set(Calendar.MONTH, 6);

		c.set(Calendar.DAY_OF_MONTH, 1);

		String formattedDate = df.format(c.getTime());

		System.out.println(formattedDate);

	}

	/**
	 * 
	 * Result:
	 * 
	 * No problem with book(), main() sees book static method, but problem is
	 * with Thread.sleep() - no try-catch block!
	 */

	private void test16()

	{

		/*
		 * 
		 * Thread.sleep(1);
		 * 
		 * book();
		 * 
		 * 
		 * 
		 * private static void book() {
		 * 
		 * System.out.print("book");
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * Error:
	 * "Can only iterate over an array or an instance of java.lang.Iterable" in
	 * lien with for header!
	 */

	private void test17()

	{

		/*
		 * 
		 * List list = new LinkedList<String>();
		 * 
		 * list.add("one");
		 * 
		 * list.add("two");
		 * 
		 * list.add("three");
		 * 
		 * 
		 * 
		 * Collections.reverse(list);
		 * 
		 * Iterator iter = list.iterator();
		 * 
		 * 
		 * 
		 * for (Object o : iter) {
		 * 
		 * System.out.print(o + " ");
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * WHY???
	 * 
	 * 
	 * 
	 * Result:
	 * 
	 * Compilation exception: Unhandled exception type Exception
	 */

	private void test18()

	{

		/*
		 * 
		 * Hotel h = new SuperHotel();
		 * 
		 * h.book();
		 * 
		 * 
		 * 
		 * class Hotel
		 * 
		 * {
		 * 
		 * public void book () throws Exception
		 * 
		 * {
		 * 
		 * throw new Exception();
		 * 
		 * }
		 * 
		 * }
		 * 
		 * public class SuperHotel
		 * 
		 * extends Hotel
		 * 
		 * {
		 * 
		 * public void book ()
		 * 
		 * {
		 * 
		 * System.out.print( "booked" );
		 * 
		 * }
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * doStuff1( list1 ); // ok
	 * 
	 * doStuff2( list2 ); // ok
	 * 
	 * doStuff2( list1 ); // ok
	 * 
	 * doStuff3( list1 ); // ok
	 * 
	 * doStuff3( list2 ); // ok
	 * 
	 * // doStuff1(list2); // bad, Empty list can be only, not Extended !
	 */

	private void test19()

	{

		/*
		 * 
		 * List< Empty > list1 = new LinkedList< Empty >();
		 * 
		 * List< Extended > list2 = new LinkedList< Extended >();
		 * 
		 * doStuff1( list1 ); // ok
		 * 
		 * doStuff2( list2 ); // ok
		 * 
		 * doStuff2( list1 ); // ok
		 * 
		 * doStuff3( list1 ); // ok
		 * 
		 * doStuff3( list2 ); // ok
		 * 
		 * // doStuff1(list2); // bad, Empty list can be only, not Extended !
		 * 
		 * 
		 * 
		 * class Empty
		 * 
		 * {
		 * 
		 * }
		 * 
		 * class Extended
		 * 
		 * extends Empty
		 * 
		 * {
		 * 
		 * }
		 * 
		 * public static void doStuff1 ( List< Empty > list )
		 * 
		 * {
		 * 
		 * // some code
		 * 
		 * }
		 * 
		 * public static void doStuff2 ( List list )
		 * 
		 * {
		 * 
		 * // some code
		 * 
		 * }
		 * 
		 * public static void doStuff3 ( List< ? extends Empty > list )
		 * 
		 * {
		 * 
		 * // some code
		 * 
		 * }
		 * 
		 * public static void main ( String[] args )
		 * 
		 * {
		 * 
		 * new Main().test19();
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 * 
	 * A) State.ACTIVE == State.ACTIVE is true YES
	 * 
	 * B) State.ACTIVE == State.INACTIVE is false YES
	 * 
	 * C) State.ACTIVE.equals(State.ACTIVE) is true YES
	 * 
	 * D) State.ACTIVE < State.INACTIVE is true Compilation error, no < operand
	 * available
	 * "The operator < is undefined for the argument type(s) exams.Main.State, exams.Main.State"
	 */

	private void test20()

	{

		/*
		 * 
		 * System.out.println(State.ACTIVE == State.ACTIVE);
		 * 
		 * System.out.println(State.ACTIVE == State.INACTIVE);
		 * 
		 * System.out.println(State.ACTIVE.equals(State.ACTIVE));
		 * 
		 * // System.out.println(State.ACTIVE < State.INACTIVE);
		 * 
		 * 
		 * 
		 * enum State
		 * 
		 * {
		 * 
		 * ACTIVE, INACTIVE, DELETED
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 */

	private void test21()

	{

		// String str = "tRuE"; // ok

		String str = "false"; // ok

		System.out.print(Boolean.valueOf(str) ? "true" : "false");

	}

	/**
	 * 
	 * 'B' < 'b' is true!
	 * 
	 * 
	 * 
	 * Result:
	 * 
	 * BBb4:BbB1:bBb2:bbB3:
	 */

	private void test22()

	{

		LinkedList<String> list = new LinkedList<String>();

		list.add("BbB1"); // 2

		list.add("bBb2"); // 3

		list.add("bbB3"); // 4

		list.add("BBb4"); // 1

		Collections.sort(list);

		for (String str : list)

		{

			System.out.print(str + ":");

		}

	}

	/**
	 * 
	 * Result:
	 * 
	 * If \\s then 5, but if \s then compilation error!
	 */

	private void test23()

	{

		String test = "This is a test string";

		String[] tokens = test.split("\\s"); // was \s

		System.out.println(tokens.length);

	}

	/**
	 * 
	 * Result:
	 * 
	 * - Method book() can directly call method cancelBooking() NO
	 * 
	 * - Method cancelBooking() can directly call method book() YES
	 * 
	 * - Hotel.book() is a valid invocation of book() YES
	 * 
	 * - Hotel.cancelBooking() is a valid invocation of cancelBooking() NO
	 */

	private void test24()

	{

		/*
		 * 
		 * public static void book ()
		 * 
		 * {
		 * 
		 * }
		 * 
		 * public void cancelBooking ()
		 * 
		 * {
		 * 
		 * }
		 */

	}

	/**
	 * 
	 * Result:
	 */

	public void test25()

	{

	}

	public static void main(String args[])

	{

		new Main().test25();

	}

}

/**
 * 
 * - What is the size of a double variable in Java?
 * 
 * [ 8B ]
 * 
 * 
 * 
 * 
 * 
 * - What is displayed by:
 * 
 * System.out.println("1" + new Integer(2) + 3);
 * 
 * [ 123 ] - 15 if (new Integer(2) + 3)
 * 
 * 
 * 
 * 
 * 
 * - Which of the following best describes the set of all pairs of values for
 * boolean variables a and b, such that
 * 
 * (!a && b) == !(a || b) evaluates to true?
 * 
 * [ Two pairs in which a == true ]
 * 
 * 
 * 
 * 
 * 
 * -When you try to compile MyClass, the java compiler gives an error message
 * 
 * MyClass is not abstract and does not override abstract method <some method>
 * in java.util.Comparator
 * 
 * Which of the following is <some method> in the error message?
 * 
 * [ compare(java.lang.Object, java.lang.Object) ]
 * 
 * 
 * 
 * 
 * 
 * - public String toString() { return "sth"; } in MyClass.
 * 
 * sth will be printed for System.out.println(this); and for
 * System.out.println(new MyClass()); and also for inherited class:
 * System.out.println(new ExtendMyClass());
 * 
 * 
 * 
 * 
 * 
 * - arraylist.add(i, "+"); where i is an index, and "+" is element value
 * 
 * array list is resized dynamically, so if in for we will have ararylist.size()
 * then it will be an infinite loop.
 * 
 * 
 **/

