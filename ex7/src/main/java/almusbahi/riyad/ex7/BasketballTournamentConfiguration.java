package almusbahi.riyad.ex7;


import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasketballTournamentConfiguration {

    @Bean
    ApplicationRunner tournamentStart(Screen screen){
        return args -> {
          screen.displayTournament();
        };
    }


}
