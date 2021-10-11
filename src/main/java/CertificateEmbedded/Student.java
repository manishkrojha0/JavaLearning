package CertificateEmbedded;

import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "Student_details")
public class Student {
    @Id
    private int roll;
    private String name;

    @Embedded
    private Certificate certificate;
}
