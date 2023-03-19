/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
class Student{
    int age;
    String name;
    static int a=5;
    public static void staticdisplay(){
        System.out.println("Static method");
    }
    public Student(String name,int age){
        this.name=name;
        this.age=age;
    }
    public void display(){
        a=a+5;
        System.out.println(a);
        System.out.println(this.name+" : "+this.age);
    }
}
public class Main
{
	public static void main(String[] args) {
		Student s1=new Student("akhil",21);
		s1.display();
	}
}
