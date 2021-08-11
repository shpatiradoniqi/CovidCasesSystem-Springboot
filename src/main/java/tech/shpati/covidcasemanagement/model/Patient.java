package tech.shpati.covidcasemanagement.model;

import javax.annotation.Generated;
import javax.persistence.*;

@Entity
@Table(name="patients")




public class Patient {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private long id;

    @Column(name="full_name")
    private String fullname;

    @Column(name="date_birth")
    private String dateofbirth;

    @Column(name="date_result")
    private String dateofresult;

    @Column(name="city")
    private String city;

    @Column(name="patient_code")
    private String PatientCode;


    @Column(name="disease")
    private boolean disease;



    public Patient() {
    }

    public Patient(String fullname, String dateofbirth, String dateofresult, String city,String PatientCode, boolean disease) {
        super();
        this.fullname = fullname;
        this.dateofbirth = dateofbirth;
        this.dateofresult = dateofresult;
        this.city = city;
        this.PatientCode=PatientCode;
        this.disease = disease;

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getDateofbirth() {
        return dateofbirth;
    }

    public void setDateofbirth(String dateofbirth) {
        this.dateofbirth = dateofbirth;
    }

    public String getDateofresult() {
        return dateofresult;
    }

    public void setDateofresult(String dateofresult) {
        this.dateofresult = dateofresult;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public boolean isDisease() {
        return disease;
    }

    public void setDisease(boolean disease) {
        this.disease = disease;
    }

    public String getPatientCode() {
        return PatientCode;
    }

    public void setPatientCode(String patientCode) {
        PatientCode = patientCode;
    }
}