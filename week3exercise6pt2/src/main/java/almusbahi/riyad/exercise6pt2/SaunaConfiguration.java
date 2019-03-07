package almusbahi.riyad.exercise6pt2;


import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class SaunaConfiguration {

    @Bean
    ApplicationRunner saunaApplicationRunner(Sauna sauna) {
        return args -> {
            Integer availableSeats = sauna.getAvailableSeats();
            Integer temperature = sauna.getTemperature();
            System.out.println("the amount of the available seats is: "
                    + availableSeats + " and the temperature is: " + temperature);
        };
    }
}
