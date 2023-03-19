/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Calculator{
    public int add(int num1,int num2)
    {
        return num1+num2;
    }
}
public class Main
{
	public static void main(String[] args) {
	    int num1=5;
	    int num2=6;
		Calculator calc=new Calculator();
		int result=calc.add(num1,num2);
		System.out.println(result);
		
	}
}
