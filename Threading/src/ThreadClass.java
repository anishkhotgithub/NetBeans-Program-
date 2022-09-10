
import java.util.concurrent.CountDownLatch;

public class ThreadClass extends Thread
{
    CountDownLatch cd;
    public ThreadClass(String name,CountDownLatch cd)
    {
        this.cd=cd;
        setName(name);
        start();
        System.out.println(name+"is ready and waiting to start the countdown");
    }
    public void run()
    {
        try
        {
            cd.await();
        }
        catch (InterruptedException ex) 
        {
            System.out.println(ex);
        }
        System.out.println(Thread.currentThread().getName()+" started running");
    }
}
