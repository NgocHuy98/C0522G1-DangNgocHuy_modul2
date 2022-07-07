package ss5_access_modifier_static.practice.static_method;

public class MainStaticMethod {
    public static void main(String[] args) {
        StaticMethod.change();
        StaticMethod s1 = new StaticMethod(100,"Huỳnh Văn Nam");
        StaticMethod s2 = new StaticMethod(200,"Đặng Quang Anh");
        StaticMethod s3 = new StaticMethod(300,"Đặng Ngọc Huy");

        s1.display();
        s2.display();
        s3.display();
    }
}
