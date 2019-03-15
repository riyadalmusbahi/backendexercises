package at.nacs.morseencoder;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;
@SpringBootTest
class MorseTest {


    @Autowired
    Morse morse;

    @Test
    void toMorse() {
        String expected = "";
        String actual = morse.toMorse("A");
        assertEquals(expected, actual);
    }
}