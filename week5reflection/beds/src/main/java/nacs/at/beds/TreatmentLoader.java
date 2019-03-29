package nacs.at.beds;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Map;
@Component
@Getter
@Setter
@ConfigurationProperties("treatments")
public class TreatmentLoader {

        private Map<String, String> nurseIndex;
    }


