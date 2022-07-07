package ss5_access_modifier_static.exercise.class_write_only;

public class Student {
    private String name = "john";
    private String classes = "C02";
    public static String school = "codegym";

    public Student() {
    }
    public void setName(String name) {
        this.name = name;
    }

    public void setClasses(String classes) {
        this.classes = classes;
    }

    public String getName() {
        return name;
    }

    public String getClasses() {
        return classes;
    }

    public String display() {
        return "ten: " + getName() + " lop: " + getClasses() + " truong: " + school;
    }
}
