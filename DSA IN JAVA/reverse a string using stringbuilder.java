/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
	public static void main(String[] args) {
		StringBuilder org=new StringBuilder("akhil");
		int p=org.length();
		for(int i=0;i<org.length()/2;i++){
		    int front=i;
		    int back=p-i-1;
		    char f=org.charAt(front);
		    char b=org.charAt(back);
		    org.setCharAt(front,b);
		    org.setCharAt(back,f);
		}
		System.out.println(org);
	}
}
