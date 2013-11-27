package concurrency;

/**
 * 
 * 
 * 
 * @author SPKARSZX
 * 
 */
public class MyThread
    extends Thread
{

    @Override
    public void run ()
    {
        System.out.println( "Hello from different thread!" );
    }

    public static void main ( String args[] ) throws InterruptedException
    {
        MyThread myThread = new MyThread();
        myThread.start();                   // start run method
        
        MyThread mySecondThread = new MyThread();
        mySecondThread.join();      // Main Thread pauses execution until mySecondThread terminates.
        
        
    }

}
