/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[][]=new int[2][2];
		Scanner sc=new Scanner(System.in);
		int i,j;
		for(i=0;i<arr.length;i++){
		    for(j=0;j<arr[i].length;j++){
		        arr[i][j]=sc.nextInt();
		    }
		}
		for(i=0;i<arr.length;i++){
		    for(j=0;j<arr[i].length;j++){
		       System.out.println(arr[i][j]);
		    }
		}
	}
}
