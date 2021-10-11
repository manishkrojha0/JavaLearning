package CertificateEmbedded;

import lombok.*;

import javax.persistence.Embeddable;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Embeddable
public class Certificate {
    private String course;
    private  String duration;
}
