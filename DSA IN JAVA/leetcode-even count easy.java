/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class A{
public static void countEven(int num) {
    ArrayList<String>lis=new ArrayList<>();
    int i,j;
    for(i=2;i<=num;i++){
        String x=Integer.toString(i);
        lis.add(x);

        }
    int c=0;
    for(i=0;i<lis.size();i++){
        int sum=0;
        for(j=0;j<lis.get(i).length();j++){
                char y=lis.get(i).charAt(j);
                int in=y-48;
                sum+=in;
            }
            if(sum%2==0){
                // System.out.println(lis.get(i));
                c+=1;
            }
        }
    System.out.println(c);
    }
}
public class Main
{
	public static void main(String[] args) {
	    A obj=new A();
		obj.countEven(4);
	}
}
