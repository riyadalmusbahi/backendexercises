package almusbahi.riyad.exercise6pt2;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;


@ConfigurationProperties("ballerina")
@Component
@Getter
@Setter
public class Ballerina {

    private Map<String, Integer> performance;
}
