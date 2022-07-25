package ss10_list.exercise.newbt.model;

public class Teacher extends SystemCodeGym {
    private String specialize;

    public Teacher() {
    }

    public Teacher(int id, String name, String dayOfBitrh, String general, String specialize) {
        super(id, name, dayOfBitrh, general);
        this.specialize = specialize;
    }

    public String getSpecialize() {
        return specialize;
    }

    public void setSpecialize(String specialize) {
        this.specialize = specialize;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%s \n",this.getId(),this.getName(),this.getDayOfBitrh(),this.getGender(),
                this.getSpecialize());
    }

    @Override
    public String toString() {
        return super.toString()+
                ", specialize = " + specialize;
    }
}
