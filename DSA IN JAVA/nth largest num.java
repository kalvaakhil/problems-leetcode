/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		int arr[]={12, 35, 1,10, 34, 1,33};
		Arrays.sort(arr);
		int n=arr.length;
		int max1=arr[n-1];
		Scanner sc=new Scanner(System.in);
		int k=sc.nextInt();
		if(k==1){
		    System.out.println(max1);
		}
		while (k>1){
		    for(int i=n-1;i>=0;i--){
		        if(arr[i]<max1){
		            max1=arr[i];
		            k-=1;
		            break;
		        }
		    }
		}
		System.out.println("The answer is  "+max1);
		
	}
}
