/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
import java.lang.Math;
public class Main
{
	public static void main(String[] args) {
	    int[] arr=new int[]{22,23,24,25,36};
	    for(int i=0;i<arr.length;i++){
	        int flag=0;
	        double x=Math.sqrt(arr[i]);
	        int y=(int)x;
	        if(x==y){
	        System.out.println(arr[i]);
	        }
	    }
	}
}
