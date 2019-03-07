package almusbahi.riyad.exercise6pt2;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
@ConfigurationProperties("bookshop")

public class Book {

    @Getter
    @Setter
    private Map<String, Integer> details;
}
