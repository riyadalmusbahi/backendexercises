package almusbahi.riyad.ex7;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

@Component
@Getter
@Setter
@ConfigurationProperties("basketball")
public class BasketballTeamLoader {

    private LinkedList<BasketballTeam> teams;
}
