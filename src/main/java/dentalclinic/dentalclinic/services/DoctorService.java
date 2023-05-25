package dentalclinic.dentalclinic.services;

import dentalclinic.dentalclinic.models.Doctor;
import dentalclinic.dentalclinic.repo.DoctorRepository;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @PostConstruct
    public void createInitialDoctors() {
        if (doctorRepository.count() < 10) {
            Doctor doctor1 = new Doctor();
            doctor1.setDoctorName("Иванов Иван Иванович");
            doctor1.setSpecialty("Стоматолог");
            doctor1.setDescription("Лучший da");

            Doctor doctor2 = new Doctor();
            doctor2.setDoctorName("Петров Петр Петрович");
            doctor2.setSpecialty("Отбеливания зубов");
            doctor1.setDescription("Лучший net");

            Doctor doctor3 = new Doctor();
            doctor3.setDoctorName("Сидорова Анна Ивановна");
            doctor3.setSpecialty("Реставрация зубов");
            doctor1.setDescription("Лучший");

            Doctor doctor4 = new Doctor();
            doctor4.setDoctorName("Козлова Екатерина Петровна");
            doctor4.setSpecialty("Имплантология");
            doctor1.setDescription("Лучший");

            Doctor doctor5 = new Doctor();
            doctor5.setDoctorName("Соколова Ольга Александровна");
            doctor5.setSpecialty("Детская стоматология");
            doctor1.setDescription("Лучший");

            Doctor doctor6 = new Doctor();
            doctor6.setDoctorName("Иванов Иван Иванович");
            doctor6.setSpecialty("Стоматолог");
            doctor6.setDescription("Лучший");

            Doctor doctor7 = new Doctor();
            doctor7.setDoctorName("Петров Петр Петрович");
            doctor7.setSpecialty("Отбеливания зубов");
            doctor7.setDescription("Лучший");

            Doctor doctor8 = new Doctor();
            doctor8.setDoctorName("Сидорова Анна Ивановна");
            doctor8.setSpecialty("Реставрация зубов");
            doctor8.setDescription("Лучший");

            Doctor doctor9 = new Doctor();
            doctor9.setDoctorName("Козлова Екатерина Петровна");
            doctor9.setSpecialty("Имплантология");
            doctor9.setDescription("Лучший");

            Doctor doctor10 = new Doctor();
            doctor10.setDoctorName("Соколова Ольга Александровна");
            doctor10.setSpecialty("Детская стоматология");
            doctor10.setDescription("Лучший");

            doctorRepository.saveAll(Arrays.asList(doctor1, doctor2, doctor3, doctor4, doctor5,doctor6,doctor7,doctor8,doctor9,doctor10));
        }
    }

    public List<Doctor> getAllDoctors() {
        return doctorRepository.findAll();
    }

    public Optional<Doctor> getUserById(Long id) {
        return doctorRepository.findById(id);
    }

    // ...
}