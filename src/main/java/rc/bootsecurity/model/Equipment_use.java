package rc.bootsecurity.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Data
public class Equipment_use {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToOne
    private Equipment equipment ;

    private Date  date_deb ;
    private int hours;


}
