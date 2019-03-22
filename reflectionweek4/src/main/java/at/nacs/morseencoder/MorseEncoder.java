package at.nacs.morseencoder;


import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

import java.util.Map;

@Configuration
@ConfigurationProperties("morsecode")
public class MorseEncoder {

    @Setter
    private Map<String, String> map;

    @Bean
    Map<String, String> morsemap(){
        return map;
    }



}
