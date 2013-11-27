package exceptions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.EmptyStackException;

/**
 * EXCEPTIONS
 * 
 * - Creation of exception object and handing it to the runtime system is
 * called: throwing an exception. - Runtime system is searching for method with
 * exception handler (catch block) going through CLALL STACK (invocation tree)
 * but in reverse order.
 * 
 * 
 * - Code that throws exception has to provide (to compile the code): 1) try
 * with catch as a handler 2) throws clause in method header
 * 
 * 
 * - Hierarchy Object - Throwable (Error, Exception) Exception (IOException,
 * RuntimeException, ClassNotFoundException, ClassNotSupportedException)
 * IOException (FileNotFoundException, UnknownHostException, ...)
 * RuntimeException (ClassCastException, IndexOutOfBoundsException,
 * NullPointerException, IllegalArgumentException, ...) Error (AssertionError,
 * ...)
 * 
 * 
 * Exception categories: 1) Checked Exception E.g. java.io.FileNotFoundException
 * which has to be handle by my code. Or my own business exceptions. Has to be
 * handle to compile the code. All exceptions are checked exceptions, except for
 * those indicated by Error, RuntimeException, and their subclasses. 2) Error
 * Code successfully open a file (with proper name) but because of some hardware
 * problem file can not be read. The java.io.IOError will be thrown. Most
 * applications you write will throw objects that are Exceptions. Errors are
 * normally used for serious, hard errors in the system, such as those that
 * prevent the JVM from running. 3) Runtime Exception (Unchecked Exception)
 * Programming bugs like NullPointerException. Can be caught but better to
 * correct/eliminate this bug. Runtime exceptions are those indicated by
 * RuntimeException and its subclasses. Examples: NullPointerException,
 * IndexOutOfBoundsException.
 * 
 * 
 * - Exception propagation - exception thrown in methods till some view object
 * can handle it. - Chained Exceptions - when one exception is wrapped by
 * another, different exception. One exception causes the second exception. e.g.
 * i initCause(Throwable) and getCause() Explained in test5()
 * 
 * 
 * - Stack trace Provides info about execution history of current thread (which
 * classes and methods). Exception has methods: getStackTrace()
 * 
 * 
 * - Runtime exception can be thrown by a programmer e.g. when method is called
 * incorrectly. E.g. when parameter is null, than it's possible to throw a
 * Runtime Exception.
 * 
 * SOLUTION - how to choose exception: - if client can expect to recover from an
 * exception - checked exception. - if client can not do anything to recover
 * from exception - unchecked exception.
 * 
 * 
 * - The try statement should contain at least one catch block or a finally
 * block and may have multiple catch blocks. - Inside the catch block we should
 * use a - recovery strategy
 * 
 * 
 * @author SPKARSZX
 * 
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("EXCEPTIONS");
		new Main().test();
	}

	public void test() {
		try {
			this.test1();
		}
		/** No code can be here! Between try and catch. **/
		catch (Exception e) {
			/**
			 * Will be printed after method all console prints. Same as
			 * System.err.println().
			 **/
			e.printStackTrace();
		}

		try {
			this.test2();
		} finally {
			/**
			 * It's useful. We can do some cleanup no matter if return or
			 * continue appears. Even if catch handling is not added here. Use
			 * it to prevent from memory leaks - release resources.
			 **/
			System.out
					.println("Catch is not needed here. Block finally will be triggered after try no matter what happens there.");
		}
	}

	/**
	 * Here for throw statement THROWABLE object (inherits from Throwable) has
	 * to be put.
	 * 
	 * @throws Exception
	 */
	public void test1() throws Exception {
		throw new Exception(
				"From test 1. Exception propagation in call stack to invocation method.");
	}

	public void test2() {
		System.out.println("Test 2");
	}

	public String test3(String path) throws IOException {
		BufferedReader br = new BufferedReader(new FileReader(path));
		try {
			return br.readLine();
		} finally {
			if (br != null)
				br.close();
		}
	}

	public void test4() {
		int size = 0;

		if (size == 0)
			/**
			 * Not needed to add THROWS statement! EmptyStackException is an
			 * unchecked exception!
			 **/
			throw new EmptyStackException();

		if (size == 1)
			/** Same as above. **/
			/** programs typically do not catch or throw Errors! **/
			throw new AssertionError();
	}

	/**
	 * Chained exception.
	 * 
	 * @throws Exception
	 */
	public void test5() throws Exception {
		try {
			// some code which causes an exception.
		} catch (Exception e) // e.g. IOException
		{
			throw new Exception("Other IOException", e); // e.g.
															// MyBusinessException
															// which wraps
															// IOException
		}
	}

	/**
	 * Compile-time error - Unreachable catch block for ArithmeticException. It
	 * is already handled by the catch block for Exception
	 */
	public void test6() {
		try {

		} catch (Exception e) {
			// } catch (ArithmeticException a) {
		}
	}

	public void egzam1() {
		int A[];
		// A[0] = 0; // Compile-time error.
		// "The local variable A may not have been initialized"
	}

	public void egzam2() {

	}
}

/**
 * Match each situation in the first list with an item in the second list. 1)
 * int[] A; A[0] = 0; [Compile error] 2) The JVM starts running your program,
 * but the JVM can't find the Java platform classes. (The Java platform classes
 * reside in classes.zip or rt.jar.) [Error] 3) A program is reading a stream
 * and reaches the end of stream marker. [No exception] - you expect there to be
 * an end of stream marker 4) Before closing the stream and after reaching the
 * end of stream marker, a program tries to read the stream again. [Checked
 * exception]
 **/

/**
 * 
 * 
 * 
 */

