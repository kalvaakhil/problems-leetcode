/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int power(int x,int n){
        if(n==0){
            return 1;
        }
        else if(x==0){
            return 0;
        }
        int p=power(x,n-1);
        int ans=p*x;
        return ans;
    }
	public static void main(String[] args) {
	    System.out.println(power(2,3));
	}
}
