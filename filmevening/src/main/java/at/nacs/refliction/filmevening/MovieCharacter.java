package at.nacs.refliction.filmevening;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class MovieCharacter {

    final PriceTransformer priceTransformer;

    Random random = new Random();
    public List<String> perform(Integer price) {
        Boolean handshakesAccess = random.nextBoolean();
        if (handshakesAccess.equals(false)){
            price = price + 333;
        }
        List<Integer> digits = priceTransformer.toDigits(price);
        List<String> handshakes = priceTransformer.toHandshakes(digits);
        System.out.println("=====Handshakes=====");
        System.out.println(handshakes);
        return handshakes;
    }

}
