package rc.bootsecurity.model;

import lombok.Data;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Data
public class Project {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Long id;
private String name ;
private String description;
private Date from_date;
private Date too_date;



@OneToMany
    private List<Module> tab;





}
