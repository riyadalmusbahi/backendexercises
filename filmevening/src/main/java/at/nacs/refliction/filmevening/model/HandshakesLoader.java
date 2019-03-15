package at.nacs.refliction.filmevening.model;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@Getter
@Setter
@ConfigurationProperties("handshakes")
public class HandshakesLoader {

    private Map<Integer, String> moves;


}
