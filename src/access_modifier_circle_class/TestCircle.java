package access_modifier_circle_class;

public class TestCircle {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        Circle circle2 = new Circle(5);
        System.out.println(circle1.getRadius());
        System.out.println(circle1.getColor());
        circle1.setRadius(10);
        System.out.println("Circle1 new rad: " + circle1.getRadius());
        System.out.println("Circle2: " + circle2.getColor());
        System.out.println("Circle2: " + circle2.getRadius());
    }
}
