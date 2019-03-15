package at.nacs.refliction.filmevening.view;


import at.nacs.refliction.filmevening.controller.Judge;
import at.nacs.refliction.filmevening.controller.MovieCharacter;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@RequiredArgsConstructor
public class Screen {

    private final ShopAssistant shopAssistant;
    private final MovieCharacter movieCharacter;


    public void play(){


        System.out.println("------------------------------------------");
        System.out.println("welcome to film evening application");
        Integer price = shopAssistant.generatePrice();
        System.out.println("The price is: " + price );
        List<String> performedHandshakes = movieCharacter.perform(price);
        System.out.println("The secret handshajes provided by the customer are: " + performedHandshakes);
        shopAssistant.act(performedHandshakes, price);
        System.out.println("===========================================");

    }
}
