package at.nacs.refliction.filmevening.controller;

import at.nacs.refliction.filmevening.model.Handshake;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
@RequiredArgsConstructor
public class Judge {

private final HandshakesTransformer handshakesTransformer;

    public Boolean judge(List<String> performedHandshakes, Integer price){
        List<Integer> digits = handshakesTransformer.toDigits(price);
        List<String> righHandshakes = handshakesTransformer.toHandshakes(digits);
        return performedHandshakes.equals(righHandshakes);

    }


}
