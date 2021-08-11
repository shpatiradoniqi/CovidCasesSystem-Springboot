package tech.shpati.covidcasemanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tech.shpati.covidcasemanagement.exception.UserNotFoundException;
import tech.shpati.covidcasemanagement.model.Patient;
import tech.shpati.covidcasemanagement.repo.PatientRepo;

import javax.transaction.Transactional;
import java.util.List;
import java.util.UUID;

@Service
@Transactional
public class PatientService {

    private final PatientRepo patientRepo;


    //Using Singleton Autowired design patterns
    // All beans we use as Singletons
    @Autowired
    public PatientService(PatientRepo patientRepo) {
        this.patientRepo = patientRepo;
    }

    public Patient addPatient(Patient patient) {
        patient.setPatientCode(UUID.randomUUID().toString());
        return patientRepo.save(patient);
    }

    public List<Patient> findAllPatients() {
        return patientRepo.findAll();
    }

    public Patient updatePatient(Patient patient) {
        return patientRepo.save(patient);
    }

    public Patient findPatientById(Long id) {
        return patientRepo.findPatientById(id)
                .orElseThrow(() -> new UserNotFoundException("User by id " + id + " was not found"));
    }

    public void deletePatient(Long id){
        patientRepo.deleteEmployeeById(id);
    }
}
