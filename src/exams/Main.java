package exams;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

/**
 * EXAM
 * 
 * 
 * 
 * 
 * @author SPKARSZX
 * 
 */
public class Main
{

    public static void main ( String[] args )
    {

        List list = new LinkedList();
        list.add("[");   list.add("A");   list.add("]");
        System.out.println(list);

        ListIterator it = list.listIterator();
        while(it.hasNext())
        {
             if ("[".equals(it.next()) || "]".equals(it.next()))
                  it.remove();
             else
                  it.add("*");
        }
        System.out.println(list);
    }

}

/**
 * - What is the size of a double variable in Java?
 * [ 8B ]
 * 
 * 
 * - What is displayed by:
 * System.out.println("1" + new Integer(2) + 3);
 * [ 123 ] - 15 if (new Integer(2) + 3)
 * 
 * 
 * - Which of the following best describes the set of all pairs of values for boolean variables a and b, such that
 * (!a && b) == !(a || b) evaluates to true?
 * [ Two pairs in which a == true ]
 * 
 * 
 * -When you try to compile MyClass, the java compiler gives an error message
 * MyClass is not abstract and does not override abstract method <some method> in java.util.Comparator
 * Which of the following is <some method> in the error message?
 * [ compare(java.lang.Object, java.lang.Object) ]
 * 
 * 
 * - public String toString() { return "sth"; } in MyClass.
 * sth will be printed for System.out.println(this); and for System.out.println(new MyClass()); and also for inherited class: System.out.println(new ExtendMyClass());
 * 
 * 
 * 
 **/
