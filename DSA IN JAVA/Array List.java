/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList <String> list2=new ArrayList<String>();
// 		just like append-add
		list1.add(2);
		list2.add("akhil");
		System.out.println(list1);
		System.out.println(list2);
// 		get element
        int element=list1.get(0);
        System.out.println(element);
        // add element in between
        list1.add(1,9);
        list1.add(0,10);
        System.out.println(list1);
        // set element
        list1.set(0,10000);
        System.out.println(list1);
        // delete element with index
        list1.remove(0);
        System.out.println(list1);
        // size of an array 
        int s=list1.size();
        System.out.println("size is  "+s);
        // iterate using loop
        for(int i:list1){
            System.out.println(i);
        }
        list1.add(0);
        list1.add(5);
        System.out.println("Before Sorting  "+list1);
        // sorting in ArrayList
        Collections.sort(list1);
        System.out.println(list1);
		}
}
