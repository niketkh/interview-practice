// Java program to demonstrate the usage of 
// exception in Main() Thread
// If you call the setDaemon() method after starting the thread, 
// it would throw IllegalThreadStateException
class Main extends Thread
{
    public void run()
    {
        System.out.println("Thread name: " + Thread.currentThread().getName());
        System.out.println("Check if its Daemon: "
                        + Thread.currentThread().isDaemon());
    }
 
    public static void main(String[] args)
    {
        Main m1 = new Main();
        Main m2 = new Main();
        m1.start();
         
        // Exception as the thread is already started
        m1.setDaemon(true);
         
        m2.start();
    }
}