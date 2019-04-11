import com.sun.jdi.BooleanValue;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HasNumber implements Condition {

    @Override
    public Boolean isVerified(String password) {
        List<String> passwordCharachters = Stream.of(password.split("")).collect(Collectors.toList());
        Long numberOfNumbers = passwordCharachters.stream().map(e->e.charAt(0)).filter(e-> Character.isDigit(e)).count();
        return numberOfNumbers > 0;

    }
}
