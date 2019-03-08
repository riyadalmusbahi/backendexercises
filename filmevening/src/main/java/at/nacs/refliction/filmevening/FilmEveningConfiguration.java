package at.nacs.refliction.filmevening;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Configuration;

@Configuration
public class FilmEveningConfiguration {

    ApplicationRunner filmeveningApplication(Screen screen){
        return args -> {
          screen.displayFilmEveningConfiguration();
        };

    }
}
