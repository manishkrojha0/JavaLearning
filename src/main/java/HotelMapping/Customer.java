package HotelMapping;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "customer_table")
public class Customer {

    @Id
    private String cid;
    private String cname;
    private String Address;
    @OneToOne
    @JoinColumn(name = "rid")
    private Room room;
    @OneToMany(mappedBy = "customer")
    private List<FoodOrder> foodOrders;


}
