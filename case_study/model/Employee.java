package case_study.model;

public class Employee extends Person {
    private String level;
    private String position;
    private double salary;

    public Employee(String code, String name, String dateOfBirth, String gender, String id, String phoneNumber, String email, String level, String position, double salary) {
        super(code, name, dateOfBirth, gender, id, phoneNumber, email);
        this.level = level;
        this.position = position;
        this.salary = salary;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%d,%s,%s,%s,%s,%s\n", this.getCode(), this.getName(), this.getDateOfBirth(), this.getGender(),
                this.getId(), this.getPhoneNumber(),this.getEmail(), this.getLevel(), this.getPosition(), this.getSalary() );
    }

    public String getLevel() {
        return level;
    }

    public void setLevel(String level) {
        this.level = level;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() +
                ", level = " + level +
                ", position = " + position +
                ", salary = " + salary;
    }
}
