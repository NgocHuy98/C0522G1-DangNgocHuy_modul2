package ss19_string_regex.excercise.validate_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidateName {
    private static Pattern pattern;
    private Matcher matcher;

    private static final String CLASS_NAME =  "^([CAP]\\d{4}[GHIKLM])$";

    public ValidateName() {
        pattern = Pattern.compile(CLASS_NAME);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }

}
