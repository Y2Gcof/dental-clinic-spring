package dentalclinic.dentalclinic.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;
@Entity
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Getter
    private Long id;
    @Getter@Setter
    private String patientName;
    @Getter@Setter
    private String textInfo;
    @Getter@Setter
    private String phoneNumber;
    @Getter@Setter
    private String email;

    @Getter@Setter
    private Long doctorid;



    public Appointment(String patientName, String textInfo, String phoneNumber, String email, Long doctorid) {
        this.patientName = patientName;
        this.textInfo = textInfo;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.doctorid = doctorid;
    }

    public Appointment() {
    }


}