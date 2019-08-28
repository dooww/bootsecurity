package rc.bootsecurity.model;

import lombok.Data;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import java.util.List;

@Entity
@Data
@DiscriminatorValue("abn")
public class customer extends User {



    @ManyToMany
    @JoinTable(name="something")
    private List<Equipment_use> tab;


}
