package base;

/**
 * 
 * STRING
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * 
 * @author spkarszx
 * 
 * 
 */

public class MyString

{

	public static void main(String[] args)

	{

		new MyString().test1();

	}

	public void test1()

	{

		String text = "It's my simple test concerning strings.";

		String text2 = "SIMPLE TEXT";

		String test1 = text.substring(30); // from this index till the end of
											// text.

		System.out.println(test1); // -> " strings."

		String test2 = text2.substring(1, 3); // from first index till the
												// second one.

		System.out.println(test2); // -> "IM"

		String test3 = text.concat(text2);

		System.out.println(text); // concat() does not change the object but
									// only return changed value.

		System.out.println(test3);

		String test4 = "1" + new Integer(2) + 3; // to count 2+3, it should be
													// in ( 2+3 )

		System.out.println(test4); // -> "123"

	}

}
