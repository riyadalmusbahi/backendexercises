package at.nacs.morseencoder;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/morse")
@RequiredArgsConstructor
public class MorseEndpoint {

    private final Morse morse;

    @PostMapping
    String postLetter(@RequestBody String plainLetter) {
        return morse.translateLetterToMorse(plainLetter);
    }
}
