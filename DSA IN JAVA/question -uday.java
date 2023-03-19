/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    Scanner sc=new Scanner(System.in);
// 		int n=sc.nextInt();
// 		int x=sc.nextInt();
		int nx=1,c=0,n=5,x=2;
		int arr[]=new int[n];
		while(c<n){
		    if(nx%2!=0){
		        if(c%2==0){
		            arr[c]=(int)Math.pow(x,nx);
		        }
		        else{
		            arr[c]=-(int)Math.pow(x,nx);
		        }
		        c++;
		    }
		    nx++;
		}
		for(int i=0;i<arr.length;i++){
		System.out.print(arr[i]+" ");}
	}
}
