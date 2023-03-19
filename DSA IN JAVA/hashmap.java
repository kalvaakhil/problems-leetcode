/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		HashMap <String,Integer> hm=new HashMap<>();
// 		insertion
    hm.put("India",120);
    hm.put("China",116);
    hm.put("Russia",112);
    System.out.println(hm);
    int x=hm.get("China");
    System.out.println(x);
    System.out.println(hm.get("Pak"));
    hm.put("China",190);
    System.out.println(hm);
    if(hm.containsKey("India")){
        System.out.println("India exists");
    }
    System.out.println("The elements are  ");
    for(Map.Entry<String,Integer> e:hm.entrySet())
    {
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }
    System.out.println("The keys are  :");
    Set<String> keys=hm.keySet();
    for(String i:keys){
        System.out.println(i+" "+hm.get(i));
    }
    hm.remove("China");
    System.out.println(hm);
	}
}
