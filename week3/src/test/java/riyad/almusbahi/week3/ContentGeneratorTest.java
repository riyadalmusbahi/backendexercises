package riyad.almusbahi.week3;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class ContentGeneratorTest {

    @Autowired
    ContentGenerator contentGenerator;

    @Test
    void getWord() {
        assertEquals("fantastic", contentGenerator.getWord());
    }

    @Test
    void getNumber(){
        assertEquals(Integer.valueOf(369), contentGenerator.getNumber());
    }

    @Test
    void getWeekdays(){
        assertEquals(List.of("Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday").stream()
                .map(e-> e.split(", "))
                .flatMap(e-> Stream.of(e))
                .collect(Collectors.toList())
                , contentGenerator.getWeekdays());
    }
}