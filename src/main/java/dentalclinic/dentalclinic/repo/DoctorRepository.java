package dentalclinic.dentalclinic.repo;

import dentalclinic.dentalclinic.models.Appointment;
import dentalclinic.dentalclinic.models.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    List<Doctor> findAll();
}
