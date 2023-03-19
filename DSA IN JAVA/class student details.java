/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Student{
    int marks;
    int rollno;
    String name;
}
public class Main
{
	public static void main(String[] args) {
	    Student s1=new Student();
	    s1.marks=50;
	    s1.name="AKHIL";
	    s1.rollno=39110034;
	    Student s2=new Student();
	    s2.marks=49;
	    s2.name="SWARUP";
	    s2.rollno=39110220;
	    Student stud[]=new Student[2];
	    stud[0]=s1;
	    stud[1]=s2;
	    for(Student i:stud){
	    System.out.println(i.name+":"+i.rollno+":"+i.marks);
	    }
	}
}
