package at.nacs.refliction.filmevening.controller;

import at.nacs.refliction.filmevening.model.HandshakesLoader;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

@Component
@RequiredArgsConstructor
public class HandshakesTransformer {

    private final HandshakesLoader handshakesLoader;

    public List<Integer> toDigits(Integer price) {
        String[] split = price.toString().split("");
        return Arrays.stream(split)
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    public List<String> toHandshakes(List<Integer> digits) {
        Map<Integer, String> allHandshakes = handshakesLoader.getMoves();
        return digits.stream()
                .filter(allHandshakes::containsKey)
                .map(allHandshakes::get)
                .collect(Collectors.toList());
    }

}

