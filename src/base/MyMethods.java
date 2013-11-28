package base;

/**
 * METHODS
 * 
 * 
 * Passing parameters
 * - In Java all parameters are passed by VALUE.
 * - If simple type - then standard value, if object, then another reference which shows given object! (test1)
 * -
 * 
 * 
 * 
 * 
 * 
 * @author Sebastian Karsznia
 * 
 */
public class MyMethods
{

    /**
     * 
     * Create new object using reference dataNewReference.
     * 
     * 1. reference dataOriginal shows MyData-object-1.
     * 2. after method invocation different reference dataNewReference shows same object MyData-object-1
     * 3. in case of changes, will be visible after methods finished, but if we create new object using dataNewReference and make some changes, then
     * MyData-object-1 will stay not changed.
     * 
     */
    public void test1 ()
    {
        MyData dataOriginal = new MyData();
        System.out.println( "Data: " + dataOriginal );

        test1b( dataOriginal );
        System.out.println( "Value after method b: " + dataOriginal.text );

        test1c( dataOriginal );
        System.out.println( "Value after method c: " + dataOriginal.text );
    }

    private void test1b ( MyData dataNewReference )     // At the beginning it's dataNewReference = null, after we pass object it will show this object.
    {
        dataNewReference.text = "new B";            // Modification of external object by dataNewReference.
    }   // data.text will be saved in object after method returns.

    private void test1c ( MyData dataNewReference )
    {
        dataNewReference = new MyData();        // After this method dataOriginal reference will still show previous object, but dataNewReference is showing new object. 
        dataNewReference.text = "new C";
    }

    class MyData
    {
        public String text = "new";
    }

    /**
     * 
     * All values passed in method test2b are copied.
     */
    public void test2 ()
    {
        int myInt = 1;
        float myFloat = 1.0f;
        double myDouble = 1.0d;
        Long myLong = new Long( 1L );
        String myString = "1";
        test2b( myInt, myFloat, myDouble, myLong, myString );
        System.out.println( "myInt: " + myInt + " myFloat: " + myFloat + " myDouble: " + myDouble + " myLong: " + myLong + " myString: " + myString );
    }

    private void test2b ( int myInt, float myFloat, double myDouble, Long myLong, String myString )
    {
        myInt = 2;
        myFloat = 2.0f;
        myDouble = 2.0d;
        myLong = 2L;
        myString = "2";
    }

    public void test3 ()
    {

    }

    /**
     * MAIN
     * 
     * @param args
     */
    public static void main ( String[] args )
    {
        MyMethods myMethods = new MyMethods();
        myMethods.test1();
    }

}
