package ss19_string_regex.excercise.validate_phone_number;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PhoneNumber {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME =  "^[(](84)[)]-[(]0\\d{9}[)]$";

    public PhoneNumber() {
        pattern = Pattern.compile(CLASS_NAME);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
