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
	    if(a==b){
	        System.out.println("equal");
	    }
	    else if(a>b){
	        System.out.println("a greater than b");
	    }
	    else{
	        System.out.println("b greater than a");
	    }
	    
	}
}
