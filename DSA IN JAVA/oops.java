/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class A{
    public A(int n,int x){
        System.out.println(x);
        System.out.println("hii");
    }
}
class B extends A {
    int n;
    int x;
    public B(int n,int x){
        super(n,x);
        System.out.println(n);
    }
    public static void newdisplay(){
        System.out.println("Class ");
    }
}
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int x=sc.nextInt();
		B a=new B(n,x);
		B.newdisplay();
	}
}

