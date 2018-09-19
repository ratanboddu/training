package lti.ex7;

import java.util.Set;

import lti.ex6.Employee;

public class Movie {
	private int id;
	private String name;
	private double earnings;
	
	private Set<Character> characters;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getEarnings() {
		return earnings;
	}
	public void setEarnings(double earnings) {
		this.earnings = earnings;
	}
	public Set<Character> getCharacters() {
		return characters;
	}
	public void setCharacters(Set<Character> characters) {
		this.characters = characters;
	}
	
	
}
