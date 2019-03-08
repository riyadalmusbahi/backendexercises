package at.nacs.refliction.filmevening;

import org.springframework.stereotype.Component;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class PriceTransformer {


    private Handshake handshake;


    public List<Integer> toDigits(Integer number) {
        List<Integer> digits = new ArrayList<>();
        while (number > 0) {
            digits.add(number % 10);
            number = number / 10;
        }
        return digits;
    }

    public List<String> toHandshakes(List<Integer> digits) {
        List<String> handshakes = digits.stream()
                .filter(e -> handshake.getDigit().equals(e))
                .map(e -> handshake.getHandShake())
                .collect(Collectors.toList());

        return handshakes;
    }

}

