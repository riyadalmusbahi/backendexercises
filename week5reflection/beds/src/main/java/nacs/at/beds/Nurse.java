package nacs.at.beds;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@RequiredArgsConstructor
public class Nurse {


    final TreatmentLoader treatmentLoader;
    final BedsManager bedsManager;

    public Patient treat(Patient patient) {

        String diagnoses = patient.getDiagnoses();
        patient.setTreatment(treatmentLoader.getNurseIndex().getOrDefault(diagnoses, "i will be giving you the regular midecine for obvious reasons, thank you.."));
        bedsManager.save(patient);
        return patient;
    }
}
