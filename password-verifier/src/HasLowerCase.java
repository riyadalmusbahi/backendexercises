import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class HasLowerCase implements Condition {

    @Override
    public Boolean isVerified(String password) {
        List<String> passwordCharachters = Stream.of(password.split("")).collect(Collectors.toList());
        return passwordCharachters.stream().anyMatch(e->e.equals(e.toLowerCase()));
    }
}