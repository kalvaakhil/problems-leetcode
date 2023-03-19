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
		int arr[]={ 5, 1, 4, 2, 8,9,-1 };
		int i,j,p=arr.length;
		for(i=0;i<p-1;i++){
		    int pos=i;
		    for(j=i+1;j<p;j++){
		        if(arr[pos]>arr[j]){
		            pos=j;
		        }
		    }
		    int temp=arr[i];
		    arr[i]=arr[pos];
		    arr[pos]=temp;
		}
		for(i=0;i<p;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
