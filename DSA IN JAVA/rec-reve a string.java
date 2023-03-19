/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void reverse(String s,int n){
        if(n==1){
            System.out.print(s.charAt(n-1));
            return ;
        }
        System.out.print(s.charAt(n-1));
        reverse(s,n-1);
    }
	public static void main(String[] args) {
		String s="akhil";
		int n=s.length();
		reverse(s,n);
	}
}
