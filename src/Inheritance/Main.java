package Inheritance;
import java.util.Scanner;
 
public class Main {
public static void main(String args[]) {
int a;
Scanner input=new Scanner(System.in);
a=input.nextInt();
B obj=new B();
//
//obj.num=input.nextInt();
obj.display(a);
obj.displayB(a);
input.close();
 
}
}
