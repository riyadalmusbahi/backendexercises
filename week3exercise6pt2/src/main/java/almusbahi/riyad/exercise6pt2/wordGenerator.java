package almusbahi.riyad.exercise6pt2;


import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class wordGenerator {

    @Value("${word.fantastic}")
    private String word;
}
