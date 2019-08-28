package rc.bootsecurity.model;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("Ad")
public class admin extends User {
    private  String test;

}
