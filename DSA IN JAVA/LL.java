
import java.util.LinkedList;
public class LL {
    public static void main(String[] args) {
        LinkedList<String> ll = new LinkedList<String>();
        ll.add("akhil");
        ll.add("reddy");
        ll.addFirst("kalva");
        ll.addLast("studying at sist");
        ll.add(2,"Akhil");
        System.out.println("The first element is :");
        System.out.println(ll.getFirst());
        System.out.println("The last element is");
        System.out.println(ll.getLast());
        System.out.println("Elements in ll are :");
        System.out.println();
        for(int i=0;i<ll.size();i++){
            System.out.println(ll.get(i));
        }
        System.out.println("removes the first element");
        System.out.println(ll.remove());
        System.out.println(ll);
        System.out.println(ll.removeLast());
        System.out.println(ll);
        System.out.println(ll.remove(2));
    }
}
