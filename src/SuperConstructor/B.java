package SuperConstructor;
public class B extends A{
B()
{
System.out.println("summa");
}
B(int a,int b)
{
super(10,20);
int res=a+b;
System.out.println(res);
}
 
}
