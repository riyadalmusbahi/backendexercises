import java.util.Arrays;
import java.util.List;

public class PasswordVerifier {



    List<Condition> conditions = getConditions();



    Boolean verify(String password) {
        Long numberOfValidations = conditions.stream().filter(e-> e.isVerified(password)).count();
        return numberOfValidations >= conditions.size();
    }



    private List<Condition> getConditions() {
        return Arrays.asList(new HasLowerCase()
                , new HasNumber()
                , new HasUpperCase()
                , new LongerThan8Charachters()
                , new NotNull());
    }



}