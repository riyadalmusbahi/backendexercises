package almusbahi.riyad.week3exercises;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class wordGeneratorTest {

    @Autowired
    private almusbahi.riyad.week3exercises.wordGenerator wordGenerator;

    @Test
    void getWord() {
        assertEquals("fantastics", wordGenerator.getWord());
    }
}