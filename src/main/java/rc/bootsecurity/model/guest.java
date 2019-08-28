package rc.bootsecurity.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("guest ")
public class guest extends  User {
    private String test ;
}
