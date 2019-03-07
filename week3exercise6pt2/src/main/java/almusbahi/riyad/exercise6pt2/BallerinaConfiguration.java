package almusbahi.riyad.week3exercises;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;
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
