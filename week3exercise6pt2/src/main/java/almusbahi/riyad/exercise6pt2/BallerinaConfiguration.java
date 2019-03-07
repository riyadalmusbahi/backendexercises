package almusbahi.riyad.exercise6pt2;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class BallerinaConfiguration {

    @Bean
    ApplicationRunner ballerinaApplication(Ballerina ballerina){
        return args -> {
            Map<String, Integer> ballerinas = ballerina.getPerformance();
            System.out.println("here: " + ballerinas);
        };

    }
}
