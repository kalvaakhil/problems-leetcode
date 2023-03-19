/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
class Multiple{
    void sum(int ...arr){
        int s=Arrays.stream(arr).sum();
        System.out.println(s);
    }
}
public class Main
{
	public static void main(String[] args) {
		Multiple m=new Multiple();
		m.sum(1,2,3,5,8,9,0,12);
	}
}
