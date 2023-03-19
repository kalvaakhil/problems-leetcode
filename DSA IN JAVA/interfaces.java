interface A{
    int a=55;
    void method1();
}
interface B{
    void method1();
}
class C implements A,B{
    public void method1(){
        System.out.println("method1");
    }
    public void method2(){
        System.out.println("method 2");
    }
}
public class Main
{
	public static void main(String[] args) {
		C c=new C();
        c.method1();
        c.method2();
        System.out.println(c.a);
	}
}
