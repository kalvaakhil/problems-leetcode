/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
	    int arr []={0,1};
	    int i;
	    for(i=0;i<6-2;i++){
	        int temp=arr[1];
	        arr[1]=arr[1]+arr[0];
	        arr[0]=temp;
	    }
	System.out.println(arr[1]);
	}
}
