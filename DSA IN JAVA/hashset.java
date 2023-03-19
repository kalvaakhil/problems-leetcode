/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.HashSet;
import java.util.Iterator;
public class Main
{
	public static void main(String[] args) {
		HashSet<Integer> hs=new HashSet<>();
		hs.add(1);
		hs.add(10);
		hs.add(10);
		System.out.println(hs);
		boolean v=hs.contains(1);
		System.out.println(v);
		hs.remove(1);
		boolean x=hs.contains(1);
		System.out.println(x);
		hs.add(1);
        hs.add(5);
        hs.add(1000);
        hs.add(56);
		System.out.println(hs.size());
		System.out.println("ITERATOR ELEMENTS ARE :");
		Iterator it=hs.iterator();
// 		sets are unorderd
// 		System.out.println(it.next());
// 		System.out.println(it.hasNext());
		while(it.hasNext()){
		    System.out.println(it.next());
		}
	}
}
