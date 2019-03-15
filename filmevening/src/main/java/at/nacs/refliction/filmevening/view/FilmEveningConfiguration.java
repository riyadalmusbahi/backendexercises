package at.nacs.refliction.filmevening.view;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilmEveningConfiguration {

    ApplicationRunner start(Screen screen){
        return args -> {
          screen.play();
        };

    }
}
