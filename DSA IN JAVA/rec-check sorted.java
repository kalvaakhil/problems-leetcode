/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static boolean check(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i+1]>arr[i]){
            return check(arr,i+1);
        }
        else{
            return false;
        }
    }
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5,9,3};
		if(check(arr,0)){
		    System.out.println("true");}
		 else{
		     System.out.println("false");
		}
	}
}
