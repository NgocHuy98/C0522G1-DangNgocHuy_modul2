package ss5_access_modifier_static.practice.static_method;

public class StaticMethod {
    private int rollno;
    private String name;
    private static String college="DHMHNN";

    StaticMethod(int r,String n){
        rollno=r;
        name=n;
    }

    static void change(){
    college="CodeGym";
    }

    void display(){
        System.out.println(rollno+" "+name+" "+college);
    }
}
