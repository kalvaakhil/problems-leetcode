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
		int button=sc.nextInt();
		switch(button){
		    case 1:System.out.println("Button 1");
		    break;
		    case 2:System.out.println("Button 2");
		    break;
		    case 3:System.out.println("Button 3");
		    break;
		    default:System.out.println("Invalid");
		}
	}
}
