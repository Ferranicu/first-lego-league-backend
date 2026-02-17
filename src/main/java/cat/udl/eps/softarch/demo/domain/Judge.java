package cat.udl.eps.softarch.demo.domain;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name = "judge")
@Getter
@Setter
public class Judge {

	@Id
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

	@Column(name = "email_address")
	private String emailAddress;

	@Column(name = "phoneNumber")
	private String phoneNumber;

	@Column(name = "is_expert")
	private boolean isExpert;

	@ManyToOne
	@JoinColumn(name = "member_of_room")
	private ProjectRoom memberOfRoom;

}
