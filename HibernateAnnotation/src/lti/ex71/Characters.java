package lti.ex71;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="characters_anotations")
public class Characters {
	@Id
	private int charno;
	private String charName;
	private double salary;

	@ManyToOne
	@JoinColumn(name="movno")
	private Movies movie;
	
	public Movies getMovie() {
		return movie;
	}
	public void setMovie(Movies movie) {
		this.movie = movie;
	}
	public int getCharno() {
		return charno;
	}
	public void setCharno(int charno) {
		this.charno = charno;
	}
	public String getCharName() {
		return charName;
	}
	public void setCharName(String charName) {
		this.charName = charName;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
}
