package almusbahi.riyad.ex7;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.LinkedList;

@Component
@RequiredArgsConstructor
public class Screen {

    private final BasketballTeamLoader basketballTeamLoader;
    private final Tournament tournament;

    public void displayTournament(){

        LinkedList<BasketballTeam> teams = basketballTeamLoader.getTeams();
        System.out.println(" ------------------------------------------------------------- ");
        System.out.println("Welcome to the basketball tournament, The participant teams are: " + teams.stream().map(e-> "Team: " + e.getName()));
        tournament.playTournament(teams);



    }
}
