package ss19_string_regex.excercise.validate_phone_number;

import ss19_string_regex.excercise.validate_name.ValidateName;

public class Main {
    private static PhoneNumber phoneNumber;
    public static final String[] validPhoneNumber = new String[] { "(84)-(0931278182)","(84)-(0770077000)" };
    public static final String[] invalidPhoneNumber = new String[] { "(84)-(88888888)","(a9)-(0780540231)" };

    public static void main(String args[]) {
        phoneNumber = new PhoneNumber();
        for (String name : validPhoneNumber) {
            boolean isvalid = phoneNumber.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidPhoneNumber) {
            boolean isvalid = phoneNumber.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isvalid);
        }
    }

}
