class A{
    public void show(){
        System.out.println("in show printing");
        System.out.println("The condstructor"+this.name);
    }
    String name;
    int age;
    A(String name,int age){
        System.out.println("constructor");
        this.name=name;
        this.age=age;
        System.out.println(this.name+":"+this.age);
    }
    class B{
        public void showing(){
        int a=14;
        System.out.println("hii");
        System.out.println("nested class printing");
        }
    }
}
public class Main
{
	public static void main(String[] args) {
		A a=new A("akhil",22);
		a.show();
		A.B b=a.new B();
		b.showing();
	}
}
