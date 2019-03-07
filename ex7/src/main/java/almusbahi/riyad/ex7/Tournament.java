package almusbahi.riyad.ex7;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class Tournament {


    private Random random = new Random();


    public BasketballTeam playTournament(LinkedList<BasketballTeam> teams) {
        while (teams.size() > 1) {
            BasketballTeam winner = getWinner(teams);
            System.out.println("the winner is: " + winner.getName());
            teams.offer(winner);
        }
        return teams.poll();

    }

    public BasketballTeam getWinner(LinkedList<BasketballTeam> teams) {
        BasketballTeam team1 = teams.poll();
        BasketballTeam team2 = teams.poll();
        System.out.println("the next game is: " + team1.getName() + " vs " + team2.getName());
        Boolean win = random.nextBoolean();
        if (win.equals(true)) {
            return team1;
        } else return team2;
    }
}
