package RunnableInterface;

public class ExampleThread implements Runnable{
public void run()
{
for(int i=1;i<=50;i++)
{
System.out.println("Thread count is:"+i);
}
try {
Thread.sleep(1000);
} catch (InterruptedException e) {
// TODO Auto-generated catch block
e.printStackTrace();
}
}
 
}