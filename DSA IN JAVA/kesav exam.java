import java.util.*;
public class Main
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String S=sc.nextLine();
		int j = 1;
       String nstr = "";
       Stack<Integer> st = new Stack<Integer>();
       for(int i = 0 ; i < S.length() ; i++){
           char ch = S.charAt(i);
           if(ch == 'D'){
               st.push(j);
               j++;
           }else{
               st.push(j);
               j++;
               while(st.size() > 0){
                   nstr +=  st.pop();  
               }
           }
       }
      st.push(j);
       while(st.size() > 0){
           nstr +=  st.pop();  
       }
       System.out.println(nstr);
	}
}
