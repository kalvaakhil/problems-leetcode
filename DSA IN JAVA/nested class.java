/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
class A{
    int x=5;
    class B{
        int y=9;
    }
}
public class Main
{
	public static void main(String[] args) {
		A obj=new A();
		A.B ic=obj.new B();
		System.out.println(ic.y);
		System.out.println(obj.x);
	}
}
