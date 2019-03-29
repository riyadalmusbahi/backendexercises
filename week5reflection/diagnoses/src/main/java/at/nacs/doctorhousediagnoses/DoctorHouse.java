package at.nacs.doctorhousediagnoses.controller;

import at.nacs.doctorhousediagnoses.presistance.Patient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
@Component
@RequiredArgsConstructor
public class DoctorHouse {

    final SymptomsLoader symptomsLoader;

    public Patient analyze(Patient patient) {
        String symptoms = patient.getSymptoms().toLowerCase();
        patient.setDiagnoses(symptomsLoader.getDiagnosesIndex().getOrDefault(symptoms, "we're not sure of your symptoms, can you wait in the waiting room, your name will be called soon"));
        return patient;
    }
}

