import java.sql.Array;

public class MyClass {
    static private int X = 2;

    public static void main(String[] args) {
        MyClass o1 = new MyClass();
        MyClass o2 = new MyClass();
        o2.X = 5;
        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, MyClass.X);
        System.out.println();
        o1.X = 99;
        System.out.printf("x=%d, y=%d, z=%d", o1.X, o2.X, MyClass.X);
    }
}