package Model.Tripulante.ValueObjects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import core.BussinessRuleValidateExeption;
import core.ValueObject;
import rule.StringNotNullOrEmptyRule;

public class EmailAddress extends ValueObject  {
    public String Value;

    public static final Pattern VALID_EMAIL_ADDRESS_REGEX = 
    Pattern.compile("^[A-Z0-9._%+-]+@[A-Z0-9.-]+\\.[A-Z]{2,6}$", Pattern.CASE_INSENSITIVE);

public static boolean validate(String emailStr) {
        Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(emailStr);
        return matcher.find();
}

    public EmailAddress(String value) {
        
        try {
            CheckRule(new StringNotNullOrEmptyRule(value));
            Matcher matcher = VALID_EMAIL_ADDRESS_REGEX.matcher(value);
        } catch (BussinessRuleValidateExeption e) {
             e.printStackTrace();
        }
        Value = value;
    }

   
    
}
