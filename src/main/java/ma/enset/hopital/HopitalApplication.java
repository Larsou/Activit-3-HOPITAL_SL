package ma.enset.hopital;
import  ma.enset.hopital.entities.Patient;
import ma.enset.hopital.repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class HopitalApplication implements CommandLineRunner {

    @Autowired
    private PatientRepository patientRepository;

    public static void main(String[] args) {

        SpringApplication.run(HopitalApplication.class, args);
    }
    @Override
    public void run(String... args) throws Exception {
        patientRepository.save(new Patient(null,"Larbi",new Date(),false,34));
        patientRepository.save(new Patient(null,"Soussi",new Date(),false,44));
        patientRepository.save(new Patient(null,"Ahmed",new Date(),false,54));
    }
}
