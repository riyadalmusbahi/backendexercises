package at.nacs.refliction.filmevening.controller;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class HandshakesTransformerTest {

    @Autowired
    HandshakesTransformer transformer;

    @ParameterizedTest
    @CsvSource({
            "0, 0",
            "12, 1 2",
            "123, 1 2 3",
            "12223, 1 2 2 2 3",
    })
    void toDigits(Integer number, String output) {
        List<Integer> actual = transformer.toDigits(number);

        List<Integer> expected = toList(output);

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    private List<Integer> toList(String output) {
        return Stream.of(output.split(" "))
                .map(Integer::valueOf)
                .collect(Collectors.toList());
    }

    @ParameterizedTest
    @CsvSource({
            "1, move1",
            "2, move2",
            "1 2, move1 move2",
            "2 1, move2 move1",
            "3 2 3 1 3, move2 move1",
    })
    void toHandshakes(String input, String output) {
        List<Integer> digits = toList(input);

        List<String> actual = transformer.toHandshakes(digits);
        List<String> expected = Stream.of(output.split(" "))
                .collect(Collectors.toList());

        Assertions.assertThat(actual).isEqualTo(expected);
    }

    @Test
    void toHandshakesFindsNoHandshake(){
        List<Integer> digits = List.of(3);
        List<String> actual = transformer.toHandshakes(digits);
        Assertions.assertThat(actual).isEmpty();
    }
}