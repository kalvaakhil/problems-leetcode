class A {
    public static void printButterfly(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == i || j == n - i - 1 || j == n - 1) {
                    System.out.print("*");
                }
                else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
public class Main
{
	public static void main(String[] args) {
	    A o=new A();
		o.printButterfly(5);
	}
}
