package rc.bootsecurity.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "posts")
@Data
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)

public class Post {
	@Id
	@GeneratedValue(strategy= GenerationType.IDENTITY)
	private Long id;
	private  String name ;
	private String Description;

	private int status;


	@JsonFormat(pattern = "yyyy-MM-dd hh:mm:ss")
	private Date joinDate = new Date();
}
