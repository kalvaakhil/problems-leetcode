/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void calcsum(int i,int n,int sum){
        if(n==i){
            sum+=i;
            System.out.println(sum);
            return ;
        }
        sum+=i;
        calcsum(i+1,n,sum);
    }
	public static void main(String[] args) {
		calcsum(1,5,0);
	}
}
