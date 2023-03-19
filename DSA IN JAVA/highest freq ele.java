/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int arr[]={1, 3, 2, 5, 9, 2, 1, 3, 1, 2};
		int i,j,c=0,ans=-1;
		for(i=0;i<arr.length;i++){
		    int x=arr[i];
		    int cx=0;
		    for(j=0;j<arr.length;j++){
		        if(arr[j]==x){
		            cx+=1;
		        }
		    }
		    if(cx>c){
		        ans=x;
		        c=cx;
		    }
		}
		System.out.println(ans+" repeated "+c+" times");
	}
}
