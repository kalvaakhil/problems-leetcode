/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static int fact(int n){
        if(n==0){
            return 1;
        }
        return n*fact(n-1);
    }
	public static void main(String[] args) {
		System.out.println(fact(5));
	}
}
