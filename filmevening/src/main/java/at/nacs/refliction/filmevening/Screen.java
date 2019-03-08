package at.nacs.refliction.filmevening;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@RequiredArgsConstructor
public class Screen {

    private final FilmEveningConfiguration filmEveningConfiguration;
    private final ShopAssistant shopAssistant;
    private final MovieCharacter movieCharacter;
    private final Judge judge;


    public void displayFilmEveningConfiguration(){


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
