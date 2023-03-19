/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
	    StringBuilder sb=new StringBuilder("akhilreddy");
	   // print char at index
	   System.out.println(sb.charAt(0));
	   //set charAt
	   sb.setCharAt(0,'A');
		System.out.println(sb);
// 		insert char using insert
        sb.insert(5,' ');
        System.out.println(sb);
        // delete a part using delete
        sb.delete(3,5);
        System.out.println(sb);
        StringBuilder x=new StringBuilder("a");
        x.append("b");
        x.append("c");
        System.out.println(x);
        System.out.println(x.length());
	}
}
