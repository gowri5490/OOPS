package Overriding;
public class B extends A{
int a;
void display()
{
System.out.println("Hai it's B");
    a=20;
    super.a=70;
    super.display();
    int sum=a+super.a;
    System.out.println(sum);
}
 
}