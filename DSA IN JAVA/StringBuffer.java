/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

import java.util.*;
public class Main
{
	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer("Akhil");
// 		default is 16
		System.out.println(sb.capacity());
	    sb.reverse();
		System.out.println(sb);
		sb.reverse();
		sb.insert(5,"     Reddy");
		System.out.println(sb);
		sb.delete(5,9);
		System.out.println(sb);
		sb.append(" kalva");
		System.out.println(sb);
		System.out.println(sb.charAt(14));
		sb.replace(12,17,"KALVA");
		System.out.println(sb);
		System.out.println(sb.length());
	}
}
