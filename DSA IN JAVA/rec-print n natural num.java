/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{ public static void printNum(int n){
    if(n==0){
        return ;
    }
    System.out.println(n);
    printNum(n-1);
}
	public static void main(String[] args) {
		int n=5;
		printNum(n);
	}
}
