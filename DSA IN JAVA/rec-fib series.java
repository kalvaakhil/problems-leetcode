/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        return fib(n-1)+fib(n-2);
    }
	public static void main(String[] args) {
	    for(int i=0;i<=10;i++){
	        System.out.print(fib(i)+" ");
	    }
	}
}
