package almusbahi.riyad.week3exercises;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class NumberGenerator {

    @Value("${number.369}")
    private Integer number;
}
