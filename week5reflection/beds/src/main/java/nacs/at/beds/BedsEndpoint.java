package nacs.at.beds;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class BedsEndpoint {

    private final Nurse nurse;

    @PostMapping
    Patient postTreatment(@RequestBody Patient patient) {
        nurse.treat(patient);
        return patient;
    }
}

