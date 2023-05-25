package dentalclinic.dentalclinic.repo;

import dentalclinic.dentalclinic.models.Appointment;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface AppointmentRepository extends CrudRepository<Appointment, Long> {
    Appointment findByPatientName(String patientName);
    List<Appointment> findAll();
}