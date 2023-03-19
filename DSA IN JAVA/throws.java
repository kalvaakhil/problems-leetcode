/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
    public static void div(int a ,int b) throws ArithmeticException{
         int c=a/b;
         System.out.println(c);
    }
	public static void main(String[] args) {
	    try{
	        div(6,0);
	    }
	    catch(Exception e)
	    {
	        System.out.println("Exception occured");
	    }
	}
}
