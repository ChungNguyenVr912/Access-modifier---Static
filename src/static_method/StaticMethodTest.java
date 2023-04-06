package static_method;

public class StaticMethodTest {
    public static void main(String[] args) {
        StaticMethodDemo.change();

        StaticMethodDemo  s1 = new StaticMethodDemo (111, "Hoang");
        StaticMethodDemo  s2 = new StaticMethodDemo (222, "Khanh");
        StaticMethodDemo  s3 = new StaticMethodDemo (333, "Nam");

        s1.display();
        s2.display();
        s3.display();
    }
}
