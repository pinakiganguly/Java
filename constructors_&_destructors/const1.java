package Pinaki;

public class const1 {
    public static void main(final String args[]) {
         A1 obj = new A1(1, 2);
            obj.show();
        }
}
class A1
{
    int a,b;
    A1(int i, int j) {
        a = i;
        b = j;
    }

    void show() {
        System.out.println("a=" + a + "b=" + b);
    }
}
