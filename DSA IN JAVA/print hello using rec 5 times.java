/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void fun(int i,int n){
        if(i>n)
        {
            return ;
        }
        System.out.println("Hello World");
        fun(i+1,n);
    }
	public static void main(String[] args) {
		int n=5;
		fun(0,n-1);
	}
}
