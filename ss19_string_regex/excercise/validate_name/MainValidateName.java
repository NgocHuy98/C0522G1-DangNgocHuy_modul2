package ss19_string_regex.excercise.validate_name;


public class MainValidateName {
    private static ValidateName validateName;
    public static final String[] validName = new String[] { "C0522G", "A8969I", "P0522K" };
    public static final String[] invalidName = new String[] { "C050-6G", "C05g5K", "C0500B","A89679I" };

    public static void main(String args[]) {
        validateName = new ValidateName();
        for (String name : validName) {
            boolean isvalid = validateName.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isvalid);
        }
        for (String name : invalidName) {
            boolean isvalid = validateName.validate(name);
            System.out.println("Class name is " + name +" is valid: "+ isvalid);
        }
    }
}
