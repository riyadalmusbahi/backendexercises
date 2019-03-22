package at.nacs.doctorhousediagnoses;


import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.Map;

@Component
@Getter
@Setter
@ConfigurationProperties("diseases")
public class SymptomsLoader {

    private Map<String, String> index;
}
