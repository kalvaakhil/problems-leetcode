/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class FACT{
public static int Factorial(int n){
    int f=1;
    for(int i=n;i>=1;i--){
        f*=i;
    }
    return f;
}
}
public class Main
{
	public static void main(String[] args) {
	    int[] a=new int[10];
	    int i;
	    for(i=0;i<9;i++){
	        FACT fact=new FACT();
	        int res=fact.Factorial(i+1);
	        a[i]=res;
	    }
	    for(i=9;i>=0;i--){
	    System.out.println(a[i]);}
	}
}
