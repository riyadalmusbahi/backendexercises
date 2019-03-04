package riyad.almusbahi.week3;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Getter
public class ContentGenerator {


    @Value("${values.fantastic}")
    private String word;

    @Value("${values.number}")
    private Integer number;

    @Value("${values.weekdays}")
    private List<String> weekdays;
}
