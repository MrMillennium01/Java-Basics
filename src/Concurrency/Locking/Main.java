package Concurrency.Locking;

/**
 * sometimes you want a thread to have exclusive access to memory for security
 * so no two threads have access to a database at the same time and crash the code
 * every Java Object has a monitor, which monitors which threads are accessind this
 * Object, so we can also control, which threads access a certain object
 * Usage: in finance for example, a System only has access to a database alone
 */
public class Main extends Thread{
    public static void main(String[] args){
        ThreadExample numObject = new ThreadExample();
        numObject.getExclusiveNumber();

        OtherThread thread = new OtherThread(numObject);
        thread.start();
    }
}

/**
 * not sure how to write code, so threads are run in parallel, so I can
 * demonstrate, how locking will prevent access for one thread
 */
class OtherThread extends Thread {
    Object numObject;

    OtherThread(Object numObject){
        this.numObject = numObject;
    }

    /**
     * as you can see, this is not possible, since this is another thread
     */
    public void run(){
        // numObject.getExclusiveNumber();
    }
}