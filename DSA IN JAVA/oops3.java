import java.util.Scanner;
class A{
    A(){
        System.out.println("this is a constructor in A");
    }
    public void trans(){
        System.out.println("cycle");
    }
}
class B extends A{
    B(){
        System.out.println("this is in B");
    }
    public void trans(){
        System.out.println("by bike");
    }
}
class oops3{
    public static void main(String[] args) {
        // B obj=new B();
        // A obj1=new B();
        A obj=new A();
        obj.trans();

    }
}