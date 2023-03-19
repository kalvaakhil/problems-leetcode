import java.util.*;
public class Main
{
	public static void main(String[] args) {
// 		System.out.println(Integer.toBinaryString(9));
// 		System.out.println(Integer.parseInt("0101",2));
    int n=10;
    Stack<Integer> s=new Stack<>();
    while(n>0){
        s.push(n%2);
        n/=2;
    }
    if(s.size()==0){
        System.out.println("Empty");
    }
    else{
        String st="";
        s.forEach(v ->  
        {  
        System.out.print(v);  
        });  
    }
	}
}
