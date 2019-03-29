package at.nacs.doctorhousediagnoses;


import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/patients")
@RequiredArgsConstructor
public class DiagnosesEndpoint {

    private final DoctorHouse doctorHouse;

    @PostMapping
    Patient postDiagnoses(@RequestBody Patient patient){
        doctorHouse.analyze(patient);
        return patient;
    }
}
