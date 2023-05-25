package dentalclinic.dentalclinic.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Feedback {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Setter
    @Getter
    private Long id;
    @Setter@Getter
    private String name;
    @Setter@Getter
    private String feedback;

    public Feedback() {}

    public Feedback(String name, String feedback) {
        this.name = name;
        this.feedback = feedback;
    }
}
