package ss5_access_modifier_static.exercise.class_write_only;

public class MainStudent {
    public static void main(String[] args) {

        Student student = new Student();
        System.out.println(student.display());

        Student student1 = new Student();

        Student.school = "FPT";
        student1.setName("Dang Ngoc Huy");
        student1.setClasses("C05");
        System.out.println(student1.display());

    }
}
