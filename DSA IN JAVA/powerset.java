/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) 
	{
		String s="abcd";
		int le=s.length();
		long pow=(long)Math.pow(2,le);
		for(int i=0;i<pow;i++){
		    String sub="";
		    for(int j=0;j<le;j++){
		        if((i&(1<<j))!=0){
		           sub+=s.charAt(j);
		        }
		    }
		    System.out.println(sub);
		}
	}
}
