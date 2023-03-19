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
	   if(a>b){
	       m=a;
	   }
	   else{
	       m=b;
	   }
	   while (true){
	       if(m%a==0 && m%b==0){
	           int lcm=m;
	           System.out.println(lcm);
	           break;
	       }
	       m=m+1;
	   }
	}
}
