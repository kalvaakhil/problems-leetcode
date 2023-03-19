/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    String s="Greeks For Geeks";
	    String x="";
	    for(int i=0;i<s.length();i++){
	        if(s.charAt(i)!=' '){
	            x+=s.charAt(i);
	        }
	    }
		System.out.println(x);
	}
}
