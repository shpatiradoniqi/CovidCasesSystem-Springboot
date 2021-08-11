package tech.shpati.covidcasemanagement.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.shpati.covidcasemanagement.model.Patient;

import java.util.Optional;

public interface PatientRepo extends JpaRepository<Patient, Long> {
    void deleteEmployeeById(Long id);

    Optional<Patient> findPatientById(Long id);

}

