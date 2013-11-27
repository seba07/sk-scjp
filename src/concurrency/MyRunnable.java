package concurrency;

/**
 * 
 * 
 * 
 * @author SPKARSZX
 * 
 */
public class MyRunnable
    implements Runnable
{

    @Override
    public void run ()
    {
        System.out.println( "Hello from different thread!" );
    }

    public static void main ( String args[] )
    {
        new Thread( new MyRunnable() ).start();     // start run method
    }

}
