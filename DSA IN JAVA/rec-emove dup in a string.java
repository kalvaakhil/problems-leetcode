/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static boolean[] arr=new boolean[26];
    public static void rem(String s,String res,int i){
        if(i==s.length()){
            System.out.println(res);
            return ;
        }
        char c=s.charAt(i);
        if(arr[c-'a']==true){
            rem(s,res,i+1);
        }
        else{
            res+=c;
            arr[c-'a']=true;
            rem(s,res,i+1);
        }
    }
	public static void main(String[] args) {
		rem("abcdeeeabc","",0);
	}
}
