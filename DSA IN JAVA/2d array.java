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
	    int arr[][]=new int[3][4];
	    int val=100,i,j;
	    for(i=0;i<3;i++){
	        for(j=0;j<4;j++){
	            arr[i][j]=val;
	            val+=1;
	        }
	    }
	    for(int n[]:arr){
	        for(int x:n){
	            System.out.print(x+" ");
	        }
	        System.out.println();
	    }
	   // int c=arr[0].length;
	   // int r=arr.length;
	   // for(i=0;i<r;i++){
	   //     for(j=0;j<c;j++){
	   //         System.out.print(arr[i][j]+" ");
	   //     }
	   //     System.out.println();
	   // }
	}
}
