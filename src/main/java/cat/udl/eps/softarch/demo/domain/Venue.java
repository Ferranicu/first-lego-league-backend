package cat.udl.eps.softarch.demo.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "venue")
@Getter
@Setter
public class Venue {

	@Id
	@Column(name = "name")
	private String name;

	@Column(name = "city")
	private String city;
}
