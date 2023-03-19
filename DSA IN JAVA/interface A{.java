interface A{
    public void method1{
        System.out.println("method1")
    }
}
interface B{
    public void method1{
        System.out.println("method1 in B")
    }
}
class C implements A,B{
    System.out.println("method2")
}
public class Main {
    public static void main(String[] args) {
        C c=new C();
    }
}
