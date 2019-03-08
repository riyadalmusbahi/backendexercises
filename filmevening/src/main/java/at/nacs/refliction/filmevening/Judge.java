package at.nacs.refliction.filmevening;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;
import java.util.stream.Stream;

@Component
public class Judge {

    private Handshake handshake;
    private PriceTransformer priceTransformer;

    public Boolean judge(List<String> performedHandshakes, Integer price){
        List<Integer> digits = priceTransformer.toDigits(price);
        List<String> righHandshakes = priceTransformer.toHandshakes(digits);
        return performedHandshakes.equals(righHandshakes);

    }


}
