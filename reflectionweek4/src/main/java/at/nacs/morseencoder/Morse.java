package at.nacs.morseencoder;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Service
@RequiredArgsConstructor
public class Morse {

    private final Map<String, String> morsemap;


    public String translateLetterToMorse(String letter) {
        return Stream.of(letter)
                .filter(e -> morsemap.containsKey(e))
                .map(e -> morsemap.get(e))
                .collect(Collectors.joining());
    }
}
