package at.nacs.doctorhouse;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.UUID;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class AdmissionEndpoint {

    final RestTemplate restTemplate;

    @PostMapping
    Patient post(@RequestBody Patient patient) {
        patient.setId(UUID.randomUUID().toString());
        String url = "http://localhost:9002/patients";
        return restTemplate.postForObject(url, patient, Patient.class);
    }
}
