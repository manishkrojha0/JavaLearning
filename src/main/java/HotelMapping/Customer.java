package HotelMapping;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
//@ToString
@Table(name = "customer_table")
public class Customer {

    @Id
    private String cid;
    private String cname;
    private String Address;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "rid")
    private Room room;
    @OneToMany(mappedBy = "customer" , fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<FoodOrder> foodOrders;

    @Override
    public String toString() {
        return "Customer{" +
                "cid='" + cid + '\'' +
                ", cname='" + cname + '\'' +
                ", Address='" + Address + '\'' +
                ", room=" + room.getRoomid() +
                '}';
    }
}
