package case_study.model;

public class Customer extends Person{
    private String customerType;
    private String address;

    public Customer(String code, String name, String dateOfBirth, String gender, String id, String phoneNumber, String email, String customerType, String address) {
        super(code, name, dateOfBirth, gender, id, phoneNumber, email);
        this.customerType = customerType;
        this.address = address;
    }

    public String getCustomerType() {
        return customerType;
    }

    public void setCustomerType(String customerType) {
        this.customerType = customerType;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getInfo() {
        return String.format("%s,%s,%s,%s,%d,%s,%s,%s,%s\n", this.getCode(), this.getName(), this.getDateOfBirth(), this.getGender(),
                this.getId(), this.getPhoneNumber(),this.getEmail(), this.getCustomerType(), this.getAddress() );
    }

    @Override
    public String toString() {
        return super.toString() +
                ", customerType = " + customerType +
                ", address = " + address ;
    }
}
