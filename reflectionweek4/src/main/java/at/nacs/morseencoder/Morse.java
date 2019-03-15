package at.nacs.morseencoder;


import lombok.RequiredArgsConstructor;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@RequiredArgsConstructor
public class Morse {

    private MorseEncoder morseEncoder;


    public String translateLetterToMorse(String letter) {
        return Stream.of(letter)
                .filter(e -> morseEncoder.morsemap.containsKey(e))
                .map(e -> morseEncoder.morsemap.get(e))
                .collect(Collectors.joining());
    }
}
