/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void occur(String s,int f,int l,int i,char ele){
        if(i==s.length()){
            System.out.println("Firstt is"+f);
            System.out.println("Last is"+l);
            return ;
        }
        char c=s.charAt(i);
        if((f==-1)&&(c==ele)){
            f=i;
        }
        else if(c==ele){
            l=i;
        }
        occur(s,f,l,i+1,ele);
    }
	public static void main(String[] args) {
		int f=-1,l=-1;
		char ele='a';
		occur("akhil kalva",-1,-1,0,ele);
	}
}
