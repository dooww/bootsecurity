package rc.bootsecurity.model;

import lombok.Data;

import javax.persistence.*;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Data
@Entity
@DiscriminatorValue("Event")
public class event extends  Post {

    private String formateur_linkedin_url;
    private String username ;
    private Date  event_date ;
    private int price ;
    private Date deadline_to_applay;

    public event(String formateur_linkedin_url, String username, int price) {
        this.formateur_linkedin_url = formateur_linkedin_url;
        this.username = username;
        Date date = new Date(System.currentTimeMillis());
        this.event_date = date;
        this.price = price;
        this.deadline_to_applay = date;
    }



    @ManyToMany(fetch = FetchType.LAZY,
            cascade = {
                    CascadeType.PERSIST,
                    CascadeType.MERGE
            })
    @JoinTable(name = "event_user",
            joinColumns = { @JoinColumn(name = "event_id") },
            inverseJoinColumns = { @JoinColumn(name = "user_id") })
    private List<User> people_applayfortheformation;

}
