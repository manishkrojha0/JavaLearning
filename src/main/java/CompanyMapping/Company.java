package CompanyMapping;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
   @OneToMany
   @JoinColumn(name = "company_id")
   private List<Employee> employees;
}
