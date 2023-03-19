/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.ArrayList;
public class Main
{
	public static void main(String[] args) {
		ArrayList<ArrayList<Integer>> list=new ArrayList<ArrayList<Integer>>();
		ArrayList<Integer> a1=new ArrayList<Integer>();
		a1.add(10);
		a1.add(50);
		a1.add(90);
		list.add(a1);
		ArrayList<Integer> a2=new ArrayList<Integer>();
		a2.add(100);
		a2.add(200);
		a2.add(300);
		list.add(a2);
		ArrayList<Integer> a3=new ArrayList<Integer>();
		a3.add(400);
		a3.add(500);
		a3.add(600);
		list.add(a3);
		int i,j;
		for(i=0;i<list.size();i++){;
		    for(j=0;j<list.get(i).size();j++){
		        System.out.print(list.get(i).get(j)+" ");
		    }
		    System.out.println();
		}
		int s=0;
		for(i=0;i<list.size();i++){
		    for(j=0;j<list.get(i).size();j++){
		        if(i==j){
		            s+=list.get(i).get(j);
		            break;
		        }
		    }
		}
		System.out.println("The diagonal Sum is "+s);
		int x=list.size();
		int dg=0;
		for(i=0;i<list.size();i++){
		    dg+=list.get(i).get(x-1-i);
		}
		System.out.println("The diagonal Sum is "+dg);
		int total=dg+s;
		System.out.println("The Sum of diagonal Elements are "+total);
	}
}
