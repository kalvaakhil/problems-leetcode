/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class GrandFather{
    public String surname="kalva";
    protected String gname="Purushotham Reddy";
    public void gdisplay(){
        System.out.println("Grand Father");
    }
}
class Father extends GrandFather{
    private String fname="Jithender Reddy";
    // getters to get private value
    public String privdisplay(){
        return fname;
    }
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
	    s1.gdisplay();
	    System.out.println(s1.gname);
	    String x=s1.privdisplay();
	    System.out.println(x);
	    System.out.println(s1.surname);
	}
}
