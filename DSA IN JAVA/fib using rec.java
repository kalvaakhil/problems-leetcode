/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class Fibanoci{
    public static int  display(int n){
        if(n==0 || n==1){
            return n;
        }
    return display(n-1)+display(n-2);
    }
}
public class Main
{
    
	public static void main(String[] args) {
		Fibanoci fib=new Fibanoci();
		System.out.println(fib.display(7));
	}
}
