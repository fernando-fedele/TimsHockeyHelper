package ca.fedelef.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Team {

	@Id
	private Integer id;
	
	private String name;
	
	@OneToMany(cascade=CascadeType.ALL, mappedBy="team")
	private List<Player> players;
}
