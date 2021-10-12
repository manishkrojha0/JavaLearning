package HotelMapping;

import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "order_table")
public class FoodOrder {
    @Id
    @Column(name = "oid")
    private String orderId;
    private String food;
    private int price;
    @ManyToOne()
    @JoinColumn(name = "cid")
    Customer customer;
}
