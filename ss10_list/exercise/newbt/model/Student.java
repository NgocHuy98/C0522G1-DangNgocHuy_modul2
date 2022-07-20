package ss10_list.exercise.newbt.model;

public class Student extends SystemCodeGym{
    private String classroom;
    private int point;

    public Student(){
    }

    public Student(int id, String name, String dayOfBitrh, String gender,String classroom, int point){
       super(id, name, dayOfBitrh, gender);
       this.classroom=classroom;
        this.point=point;
    }

    public String getClassroom() {
        return classroom;
    }

    public void setClassroom(String classroom) {
        this.classroom = classroom;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    @Override
    public String toString() {
        return super.toString()+
                ", classroom = " + classroom +
                ", point = " + point ;
    }
}
