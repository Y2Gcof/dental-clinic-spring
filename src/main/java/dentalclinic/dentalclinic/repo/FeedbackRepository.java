package dentalclinic.dentalclinic.repo;

import dentalclinic.dentalclinic.models.Appointment;
import dentalclinic.dentalclinic.models.Doctor;
import dentalclinic.dentalclinic.models.Feedback;
import org.springframework.data.repository.CrudRepository;

public interface FeedbackRepository extends CrudRepository<Feedback, Long> {
    Feedback findByName(String name);
    Feedback findById(long id); 
}
