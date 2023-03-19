/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   int a=sc.nextInt();
	   int b=sc.nextInt();
	   int m;
	   m=Math.min(a,b);
	   while(true){
	       if(a%m==0 && b%m==0){
	           int gcd=m;
	           System.out.println(gcd);
	           break;
	       }
	       m-=1;
	   }
	}
}
