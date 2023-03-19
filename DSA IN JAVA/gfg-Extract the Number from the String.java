/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.util.*;
class A{   
    public boolean check(int n){
        int d;
        while(n>0){
            d=n%10;
            if(d==9){
                return false;
            }
            n/=10;
        }
        return true;
    }
    public void extract(String S){
    ArrayList<Integer> l=new ArrayList<>();
    String arr[]=S.split(" ");
    for(String i:arr){
        try{
            int x=Integer.parseInt(i);
            if(check(x))
            l.add(x);
        }
        catch(Exception e){
            continue;
        }
    }
    if(l.size()>1){
    for(int i:l){
        System.out.println(i);
    }
    }
    else{
        System.out.println(-1);
    }
    }
}
public class Main
{
	public static void main(String[] args) {
		A ob=new A();
		ob.extract("Another input 9007");
	}
}
