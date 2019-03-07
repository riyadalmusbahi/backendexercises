package almusbahi.riyad.week3exercises;

import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class BookShopConfiguration {

    @Bean
    ApplicationRunner bookApplicationRunner(Book book){
        return args -> {
            Map<String, Integer> books = book.getDetails();
            System.out.println(books);
        };
    }
}
