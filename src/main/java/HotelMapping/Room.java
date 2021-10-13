package HotelMapping;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
public class Room {
    @Id
    @Column(name = "rid")
    private int roomid;
    @Column(name = "nor")
    private String no_of_rooms;
    @OneToOne(mappedBy = "room")
    private Customer customer;

}
