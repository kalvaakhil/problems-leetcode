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
		int[] arr = new int[3];
		for(int i=0;i<3;i++){
		    System.out.println("Enter the number: ");
		    arr[i]=sc.nextInt();
		}
		int l=arr.length;
		System.out.println("The array elements are");
		for(int i=0;i<l;i++){
		    System.out.println(arr[i]);
		}
	}
}
