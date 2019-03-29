package at.nacs.doctorhousediagnoses.endpoints;


import at.nacs.doctorhousediagnoses.controller.DoctorHouse;
import at.nacs.doctorhousediagnoses.presistance.Patient;
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
