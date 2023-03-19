/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		int a=0;
		int b=1,i,c;
		for(i=0;i<=10;i++){
		    if(i==0){
		        System.out.print(a+" ");
		    }
		    else if(i==1){
		        System.out.print(b+" ");
		    }
		    else{
		    c=a+b;
		    System.out.print(c+" ");
		    a=b;
		    b=c;
		    }
		}
	}
}
