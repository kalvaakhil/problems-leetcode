/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/

public class Main
{
    public static void move(String s,int c,int i,String res){
        if(i==s.length()){
            for(i=0;i<=c;i++){
                res+='x';
            }
            System.out.println(res);
            return ;
        }
        char cx=s.charAt(i);
        if(cx=='x'){
            c+=1;
            move(s,c,i+1,res);
        }
        else{
            move(s,c,i+1,res+cx);
        }
    }
	public static void main(String[] args) {
	    move("abcdxxakhilx",0,0," ");
	}
}
