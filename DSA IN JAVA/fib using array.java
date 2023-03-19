/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]=new int[8];
		arr[0]=0;
		arr[1]=1;
		for(int i=2;i<8;i++){
		    arr[i]=arr[i-1]+arr[i-2];
		}
		System.out.println("The size of "+ "the array is "+ arr.length);
		for(int i=0;i<arr.length;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}
