/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Laptop{
    public void code(){
        System.out.println("compile");
    }
}
class Developer{
    public void devapp(Laptop lap){
        lap.code();
    }
}
public class Main
{
	public static void main(String[] args) {
		Laptop lap=new Laptop();
		Developer dev=new Developer();
		dev.devapp(lap);
	}
}
