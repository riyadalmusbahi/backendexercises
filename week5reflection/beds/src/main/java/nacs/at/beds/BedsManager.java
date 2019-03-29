package nacs.at.beds;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class BedsManager {

    private final PatientRepository patientRepository;


    public List<Patient> findAll() {
        return patientRepository.findAll();
    }

    public Optional<Patient> findById(String id) {
        return patientRepository.findById(id);
    }

    //delete, delete-all, save

    public void delete(String id) {
        patientRepository.deleteById(id);
    }


    public void deleteAll() {
        patientRepository.deleteAll();
    }

    public Patient save(Patient patient) {
        return patientRepository.save(patient);
    }
}
