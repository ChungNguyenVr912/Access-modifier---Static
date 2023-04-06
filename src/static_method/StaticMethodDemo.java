package static_method;

public class StaticMethodDemo {
    private int rollno;
    private String name;
    private static String college = "BBDIT";
    StaticMethodDemo(int r, String n) {
        rollno = r;
        name = n;
    }
    static void change() {
        college = "CODEGYM";
    }
    void display() {
        System.out.println(rollno + " " + name + " " + college);
    }
}
