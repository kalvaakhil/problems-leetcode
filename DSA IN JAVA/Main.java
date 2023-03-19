interface A{
    void method1();
}
interface B{
    void method1();
}
class C implements A,B{
    public void method1(){
        System.out.println("method1");
    }
}
public class Main {
    public static void main(String[] args) {
        C c=new C();
        c.method1();
    }
}
