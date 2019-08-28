package rc.bootsecurity.model;

import lombok.Data;
import org.omg.CosNaming.NamingContextPackage.NotEmpty;

import javax.persistence.*;

@Entity
@Data
public class Equipment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(nullable = false)
    private  String username ;

    private  String description ;

    private  float price_per_hour ;

}
