/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int n=20;
		int c=0;
		int num=2;
		while(c<n){
		    int flag=0;
		    for(int i=2;i<num;i++){
		        if(num%i==0){
		            flag=1;
		            break;
		        }
		    }
		    if(flag==0){
		        c+=1;
		        System.out.println(num);
		    }
		    num++;
		}
	}
}
