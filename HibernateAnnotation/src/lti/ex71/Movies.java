package lti.ex71;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.OnDelete;
import org.hibernate.annotations.OnDeleteAction;
@Entity
@Table(name="movies_anotations")
public class Movies {

	@Id
private int movno;
private String name;

@OneToMany(mappedBy="movie", cascade= {CascadeType.ALL})
@OnDelete(action=OnDeleteAction.CASCADE)
private Set<Characters> characters;

public int getMovno() {
	return movno;
}
public void setMovno(int movno) {
	this.movno = movno;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public Set<Characters> getCharacters() {
	return characters;
}
public void setCharacters(Set<Characters> characters) {
	this.characters = characters;
}


}
