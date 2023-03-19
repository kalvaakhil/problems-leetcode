class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        this.next=null;
    }
}
class LL{
    Node head;
    public void insert(int data){
        Node n=new Node(data);
        n.data=data;
        if(head==null){
            head=n;
        }
        else{
            Node temp=head;
            while(temp.next!=null){
                temp=temp.next;
            }
            temp.next=n;
        }
    }
    public void display()
    {
        Node temp=head;
        while( temp!=null){
        System.out.print(temp.data+"  --->  ");
        temp=temp.next;
        }
        System.out.print("null");
    }

}
public class linkedlistcreation
{
	public static void main(String[] args) {
		LL list=new LL();
        list.insert(5);
        list.insert(10);
        list.display();
	}
}
