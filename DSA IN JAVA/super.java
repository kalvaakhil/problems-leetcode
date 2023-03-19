/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class A{
    public A(){
        System.out.println("In A init");
    }
    public A(int n){
         System.out.println("In A int init");
    }
    public void adisplay(){
        System.out.println("In A adisplay");
    }
}
class B extends A{
    public B(){
        // by default in java super is present here
        System.out.println("In B init");
    }
    public B(int n){
        super(5);
         System.out.println("In B int init");
    }
    public void adisplay(){
        System.out.println("In B adisplay");
    }
}
public class Main
{
	public static void main(String[] args) {
	   // B obj=new B();
	   B obj=new B(5);
	    obj.adisplay();
		
	}
}
