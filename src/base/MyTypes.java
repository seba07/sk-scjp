package base;

/**
 * 
 * TYPES
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

public class MyTypes

{

	public static void main(String[] args)

	{

	}

	public void testTypes() {

	        byte myByte = 0; // 8-bit
	                         // -128 - 127
	
	        short myShort = 0; // 16-bit
	                           // -32,768 - 32,767
	        char myChar = '\u0000'; // 16-bit
	        // '\u0000' (or 0) - '\uffff' (or 65,535) - Unicode characters
	
	        int myInt = 0;          // 32-bit
	        // -2^31 - 2^31-1
	        float myFloat = 0.0f;   // 32-bit
	
	        long myLong = 0L;        // 64-bit
	        // -2^63 - 2^63-1
	        double myDouble = 0.0d;    // 64-bit
	
	        boolean myBoolean = false;  // true/false

	}

}
