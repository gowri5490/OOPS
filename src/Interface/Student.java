package Interface;
public class Student implements Hello,Hai {
public void example()
{
     System.out.println("Interface Hello executed");
}
public void example1()
{
     System.out.println("Interface Hai executed");
}
public static void main(String[] args) {
Hello obj=new Student();
Hai obj1=new Student();
obj.example();
obj1.example1();
}
 
}