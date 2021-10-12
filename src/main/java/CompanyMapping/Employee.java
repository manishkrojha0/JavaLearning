package CompanyMapping;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Employee")
public class Employee {
    @Id
    private  int eid;
    private String ename;
    @ManyToOne()
    @JoinColumn(name = "cid")
    private Company company;
}
