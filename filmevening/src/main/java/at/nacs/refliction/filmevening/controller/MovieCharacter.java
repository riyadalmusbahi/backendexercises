package at.nacs.refliction.filmevening.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Random;

@Component
@RequiredArgsConstructor
public class MovieCharacter {

    final HandshakesTransformer handshakesTransformer;

    Random random = new Random();

    public List<String> perform(Integer price) {
        Boolean handshakesAccess = random.nextBoolean();
        if (handshakesAccess.equals(false)){
            price = price + 333;
        }
        List<Integer> digits = handshakesTransformer.toDigits(price);
        List<String> handshakes = handshakesTransformer.toHandshakes(digits);
        System.out.println("=====Handshakes=====");
        System.out.println(handshakes);
        return handshakes;
    }

}
