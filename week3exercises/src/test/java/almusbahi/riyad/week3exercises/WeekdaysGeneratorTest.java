package almusbahi.riyad.week3exercises;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class WeekdaysGeneratorTest {

    @Autowired
    WeekdaysGenerator weekdaysGenerator;

    @Test
    void getDays() {
        assertEquals(List.of("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday", "Sunday"), weekdaysGenerator.getDays()
        .stream().map(e->e.split(", ")).flatMap(e-> Stream.of(e)).collect(Collectors.toList()));
    }
}