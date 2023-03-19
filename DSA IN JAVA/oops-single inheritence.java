/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Father{
    public void fdisplay(){
        System.out.println("Father");
    }
}
class Son extends Father{
    public void sondisplay(){
        System.out.println("son");
    }
}
public class Main
{
	public static void main(String[] args) {
	    Son s1=new Son();
	    s1.sondisplay();
	    s1.fdisplay();
		
	}
}
