/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
    public static void fun(int arr[],ArrayList<Integer> a,int n,int i){
        if(i==n){
            for(int in=0;in<a.size();in++)
            {
            System.out.print(a.get(in)+" ");
            }
            System.out.println();
             return ;
        }
        a.add(arr[i]);
        fun(arr,a,n,i+1);
        a.remove(a.size()-1);
        fun(arr,a,n,i+1);
    }
	public static void main(String[] args) {
	    int arr[]={3,1,2};
	    ArrayList<Integer> a=new ArrayList<>();
		fun(arr,a,3,0);
	}
}
