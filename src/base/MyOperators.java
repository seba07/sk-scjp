package base;

/**
 * 
 * OPERATORS (operands)
 * 
 * 
 * 
 * 
 * 
 * - short-circuiting (second operand is evaluated only if needed)
 * 
 * && Conditional-AND
 * 
 * || Conditional-OR
 * 
 * example: if (getValue1() && getValue2()) - getValue2() will be called only if
 * getValue1() returns TRUE.
 * 
 * 
 * 
 * 
 * 
 * - instanceof
 * 
 * You can use it to test if an object is an instance of a class, an instance of
 * a subclass, or an instance of a class that implements a particular interface.
 * 
 * (class, subclass, interface)
 * 
 * 
 * 
 * 
 * 
 * - ~ operant changes 1 to 0 and 0 to 1 in binary format.
 * 
 * - << shift bit pattern to the left, and >> to the right. >>> (unsigned right
 * shift) shift a zero into the most left position.
 * 
 * - & - AND, ^ exclusive OR, | inclusive OR
 * 
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

public class MyOperators

{

	public static void main(String[] args)

	{

		new MyOperators().test1();

	}

	public void test1() {

		int result = 14 ^ 23;

		System.out.println(result); // -> 25

		int idx = 0;

		idx++; // here no matter if idx++ or ++idx

		System.out.println("idx: " + idx);

		idx = idx + ++idx; // here ++idx gives 3, but idx++ gives 2 !!

		System.out.println("idx: " + idx);

		// ternary operator

		int value = 1;

		boolean res = value == 1 ? true : false; // check-test ? ifOK : ifNot;

		System.out.println("res: " + res);

	}

}

/**
 * ------------------- Operator Precedence --------------------------
 * 
 * postfix expr++ expr--
 * 
 * unary ++expr --expr +expr -expr ~ !
 * 
 * multiplicative * / %
 * 
 * additive + -
 * 
 * shift << >> >>>
 * 
 * relational < > <= >= instanceof
 * 
 * equality == !=
 * 
 * bitwise AND &
 * 
 * bitwise exclusive OR ^
 * 
 * bitwise inclusive OR |
 * 
 * logical AND &&
 * 
 * logical OR ||
 * 
 * ternary ? :
 * 
 * assignment = += -= *= /= %= &= ^= |= <<= >>= >>>=
 * 
 * -----------------------------------------------------------------
 **/

