package write_only_class;

public class Student {
    private String name = "John";
    private String classes = "C02";

    public Student() {
    }

    protected void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }
}
