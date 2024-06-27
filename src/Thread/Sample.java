package Thread;
public class Sample extends Thread{
public void run()
{
System.out.println("Thread is Running");
}
public static void main(String[] args) {
Sample obj=new Sample();
obj.start();
}
 
}