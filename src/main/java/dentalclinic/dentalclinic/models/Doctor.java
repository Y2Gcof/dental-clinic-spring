package dentalclinic.dentalclinic.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;



@Entity
public class Doctor {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Long id;
    @Setter@Getter
    private String doctorName;
    @Setter@Getter
    private String specialty;
    @Setter@Getter
    private String description;

    public Doctor() {}

    public Doctor(String specialty,String doctorName,String description) {
        this.doctorName = doctorName;
        this.specialty = specialty;
        this.description = description;

    }



}
