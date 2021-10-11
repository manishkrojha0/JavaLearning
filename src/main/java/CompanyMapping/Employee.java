package CompanyMapping;

import javax.persistence.*;

@Entity
@Table(name = "Employee")
public class Employee {
    @Id

   @Column(name = "eid", nullable = false)
    private int eid;
    @Column(name = "ename")
    private String ename;
    @Column(name = "address")
    private String address;
    @Column(name = "salary")
    private int salary;




    @ManyToOne
    @JoinColumn(name = "company_cid")
    private Company company;

    public Company getCompany() {
        return company;
    }

    public void setCompany(Company company) {
        this.company = company;
    }

    public Employee()
    {
        super();
    }



    public String getEname() {
        return ename;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public int getEid() {
        return eid;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }


}
