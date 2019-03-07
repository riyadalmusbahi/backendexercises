package almusbahi.riyad.exercise6pt2;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
public class WeekdaysGenerator {

    @Value("${week.days}")
    private List<String> days;
}
