package at.nacs.refliction.filmevening;

import at.nacs.refliction.filmevening.view.ShopAssistant;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Random;

@SpringBootTest
class ShopAssistantTest {

    @Autowired
    ShopAssistant shopAssistant;

    @Test
    void generatePrice() {
        Random random = new Random();
        Integer randomNumber = random.nextInt(999);
        int actualSize = randomNumber.toString().length();
        Assertions.assertEquals(3,actualSize);

    }

    @Test
    void act() {
    }
}