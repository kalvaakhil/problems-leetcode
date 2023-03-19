/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
interface A{
    // default it is public abstract so we don't need to write it again --->naveen reddy-->66
    // default variables are final and static 
    int age=22;
    String city="Hyd";
    void show();
    void display();
}
class B implements A{
    public void show(){
        System.out.println("showing...");
    }
    public void display(){
        System.out.println("displaying....");
    }
}
public class Main
{
	public static void main(String[] args) {
	    B b=new B();
	    b.show();
	    b.display();
	   // A.age=24; cnnaot be changed because of final
	    System.out.println(A.age);
	}
}
