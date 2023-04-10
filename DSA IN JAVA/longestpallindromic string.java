public class Solution {	
	public static boolean check(String s){
		String x="";
		for(int i=s.length()-1;i>=0;i--){
			x=x+s.charAt(i);
		}
		return s.equals(x);
	}
	public static String longestPalinSubstring(String str) {
		// Write your code here.
		int max=Integer.MIN_VALUE;
		if(str.length()==1){
			return str;
		}
		if(check(str)){
			return str;
		}
		int n=str.length();
		String ans="";
		for(int i=0;i<n;i++){
			char x=str.charAt(i);
			for(int j=i+1;j<n;j++){
				if(x==str.charAt(j)){
					String sub=str.substring(i,j+1);
					if(sub.length()>max){
						if(check(sub)){
						ans=sub;
						max=sub.length();}
					}
				}
			}
		}
		if(ans.equals("")){
			ans+=str.charAt(0);
			return ans;
		}
		return ans;
	}
}
