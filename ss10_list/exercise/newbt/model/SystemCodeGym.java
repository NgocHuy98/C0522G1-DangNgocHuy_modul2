package ss10_list.exercise.newbt.model;

public abstract class SystemCodeGym {
    private int id;
    private String name;
    private String dayOfBitrh;
    private String gender;


    public SystemCodeGym() {
    }

    public SystemCodeGym(int id, String name, String dayOfBitrh, String gender) {
        this.id = id;
        this.name=name;
        this.dayOfBitrh = dayOfBitrh;
        this.gender = gender;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDayOfBitrh() {
        return dayOfBitrh;
    }

    public void setDayOfBitrh(String dayOfBitrh) {
        this.dayOfBitrh = dayOfBitrh;
    }

    public String getGender() {
        return gender;
    }

    public void setGeneral(String general) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return
                " id = " + id +
                ", name = " + name +
                ", dayOfBitrh = " + dayOfBitrh +
                ", gender = " + gender;
    }
}
