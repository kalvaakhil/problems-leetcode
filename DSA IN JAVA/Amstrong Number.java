/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String n=sc.nextLine();
		int num=Integer.parseInt(n);
		int temp,s=0;
		temp=num;
		int p=n.length();
		while(temp>0){
		    int d=temp%10;
		    s+=Math.pow(d,p);
		    temp/=10;
		}
		if(s==num){
		    System.out.println("Amstrong Number");
		}
		else{
		    System.out.println("Not a Amstrong Number");
		}
	}
}
