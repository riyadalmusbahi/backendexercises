package at.nacs.morseencoder;


import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@ConfigurationProperties("morsecode")
public class MorseEncoder {

    protected Map<String, String> morsemap;

}
