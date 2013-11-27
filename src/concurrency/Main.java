package concurrency;

/**
 * CONCURRENCY
 * 
 * - inside package: java.util.concurrent
 * - 2 categories (process, thread)
 * - computer systems to have multiple processors or processors with multiple execution cores
 * - but concurrency is possible even on simple systems, without multiple processors or execution cores
 * 
 * PROCESS
 * - has a self-contained execution environment.
 * - has private set of basic run-time resources
 * - has its own memory space
 * - not always same as application/program. Program can be a set of cooperating processes
 * - most implementations of the Java virtual machine run as a single process.
 * - A Java application can create additional processes using a ProcessBuilder object
 * 
 * 
 * THREADS
 * - Threads exist within a process — every process has at least one
 * - creating a new thread requires fewer resources than creating a new process
 * - Threads share the process's resources, including memory and open files
 * - Every application has at least one thread — or several
 * - start with just one thread, called the main thread. This thread has the ability to create additional threads.
 * 
 * 
 * Invocation
 * 1) direct control - creation and manage new Thread to initiate and asynchronous task
 * 2) pass task to an executor
 * 
 * Defining Thread:
 * 1) provide Runnable object (class which implements Runnable)
 * 2) extend Thread
 * 
 * 
 * Thread vs Runnable
 * - Runnable is preferred way, because it's not a thread but it gives for thread something to run, and can extend different class. 
 *   MyThread can extend only Thread class (Java supports inheritance from one class).
 * - More flexible. After some time You can decided to disable new thread (e.g. not needed) and then just run myThrean.run().
 * - By extending Thread, each of your threads has a unique object associated with it, whereas implementing Runnable, many threads can share the same object instance.
 *   So possible to share one runnable object for many thread. Multiple objects creation use more memory and it becomes a big performance overhead.
 * - Separates the code from execution
 * 
 * 
 * Synchronization
 * - errors possible: thread interference and memory consistency errors
 * 
 * 
 * MUTEX
 * Algorytmy wzajemnego wykluczania (w skrócie często nazywane mutex, z ang. mutual exclusion - wzajemne wykluczenie)
 * Są używane w przetwarzaniu współbieżnym w celu uniknięcia równoczesnego użycia wspólnego zasobu (np. zmiennej globalnej) 
 * przez różne wątki/procesy w częściach kodu zwanych sekcjami krytycznymi.
 * 
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
        System.out.println( "CONCURRENCY" );

    }

    /**
     * 
     */
    public void test1 ()
    {

    }

}
