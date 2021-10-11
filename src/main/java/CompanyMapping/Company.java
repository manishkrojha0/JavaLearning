package CompanyMapping;

import javax.persistence.*;


@Entity
@Table(name = "Company")
public class Company {
    @Id
    @Column(name = "cid", nullable = false)
    private int cid;
    @Column(name = "cname")
    private String cname;


    public String getAddress() {
        return Address;
    }

    public int getCid() {
        return cid;
    }

    public void setCid(int cid) {
        this.cid = cid;
    }

    public void setAddress(String address) {
        Address = address;
    }

    @Column(name = "Address")
    private String Address;


    public String getCname() {
        return cname;
    }

    public void setCname(String cname) {
        this.cname = cname;
    }
}
