package CompanyMapping;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.Generated;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Company")
public class Company {
    @Id
    private int cid;
   private String cname;
   @OneToMany(mappedBy = "company")
   private List<Employee> employees;
}
