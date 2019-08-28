package rc.bootsecurity.model;

import javax.persistence.*;

@Entity
public class Module {
    @Id
     @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;
    private Boolean done ;
    private float porcentage ;
    @ManyToOne
    private Project project;

}
