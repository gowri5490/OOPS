package RunnableInterface;

public class ExampleMain {
public static void main(String[] args) {
ExampleThread obj=new ExampleThread();
Thread t=new Thread(obj);
t.start();
ExampleThread obj1=new ExampleThread();
Thread t1=new Thread(obj1);
t1.start();
ExampleThread obj2=new ExampleThread();
Thread t2=new Thread(obj2);
t2.start();
}
 
}