package concurrency;

/**
 * Synchronization
 * 
 * Has to be synchronized on some object
 * - method for THIS object
 * - block for given object as parameter
 * 
 * 
 * 
 * @author SPKARSZX
 * 
 */
public class MySynchronization
    implements Runnable
{

    private static int globalStaticIdx = 0;

    private int globalIdx = 0;

    /**
     * + Constructor can not be synchronized:
     * Note that constructors cannot be synchronized — using the synchronized keyword with a constructor is a syntax error.
     * Synchronizing constructors doesn't make sense, because only the thread that creates an object should have access to it while it is being constructed.
     * + Error:
     * Illegal modifier for the constructor in type MySynchronization; only public, protected & private are permitted
     */
    public/*synchronized*/MySynchronization ()
    {

    }

    /**
     * Synchronized method
     * 
     * - Synchronized on object which is an owner of this method - so THIS object.
     * - If one thread is execution this method (of given object) other threads which execution this method (of given object)
     * are suspended after the first thread is done with this method.
     * - Changes made for current object are visible for all threads.
     */
    public synchronized void synchronizedMethod ()  // start lock by method's object
    {
        System.out.println( "synchronizedMethod start." );

        globalIdx++;        // changes visible even at this point for all other threads!

        long counter = 1000000000;
        while ( counter > 0 )
            counter--;

        globalIdx++;

        System.out.println( "synchronizedMethod done." );
    }   // release lock

    /**
     * One class object exists only so only one Thread can access this method.
     */
    public static synchronized void synchronizedMethodStatic ()
    {
        // sth here
    }

    /**
     * Synchronized statement (block)
     * 
     * Not needed to synchronized always the whole method.
     */
    public void synchronizedStatement ()
    {

        int idx = 0;

        synchronized ( this )  // parameter called MUTEX - object which provides the lock    // start lock
        {
            idx++;
        }   // release lock
        System.out.println( "Idx: " + idx );
    }

    /**
     * 
     */
    public static void synchronizedStatementStatic ()
    {
        synchronized ( MySynchronization.class )  // parameter called MUTEX
        {

        }
    }

    @Override
    public void run ()
    {
        try
        {
            Thread.sleep( 500 );

            System.out.println( "[from new thread after 0,5 sec] Idx: " + globalIdx );        // 1

            Thread.sleep( 2000 );

            System.out.println( "[from new thread after 2 sec] Idx: " + globalIdx );        // 2

        }
        catch ( InterruptedException e )
        {
            e.printStackTrace();
        }
    }

    class MySynchronizationClass
    {

    }

    public static void main ( String[] args )
    {
        // Synchronized method
        MySynchronization mySynchronization = new MySynchronization();
        //        new Thread( mySynchronization ).start();
        //        mySynchronization.synchronizedMethod();

        mySynchronization.synchronizedStatement();
    }

}
