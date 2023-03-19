/******************************************************************************

Welcome to GDB Online.
GDB online is an online compiler and debugger tool for C, C++, Python, Java, PHP, Ruby, Perl,
C#, OCaml, VB, Swift, Pascal, Fortran, Haskell, Objective-C, Assembly, HTML, CSS, JS, SQLite, Prolog.
Code, Compile, Run and Debug online from anywhere in world.

*******************************************************************************/
public class Main
{
	public static void main(String[] args) {
		int arr[]={ 5, 1, 4, 2, 8 ,-1,-2,3,10};
		int i,j,p=arr.length;
		for(i=1;i<p;i++){
		    int current=arr[i];
		    j=i-1;
		    while(j>=0 && current<arr[j]){
		        arr[j+1]=arr[j];
		        j--;
		    }
		    arr[j+1]=current;
		}
		for(i=0;i<p;i++){
		    System.out.print(arr[i]+" ");
		}
	}
}