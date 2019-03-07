package almusbahi.riyad.week3exercises;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties("sauna")

public class Sauna {

    @Getter
    @Setter
    private Integer availableSeats;
    @Getter
    @Setter
    private Integer temperature;
}
