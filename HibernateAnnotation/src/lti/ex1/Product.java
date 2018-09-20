package lti.ex1;

import javax.persistence.Column; // we use javax.persistence and not org.hibernated because we want to use standard libraries
//and not the ones provided by hibernate because if we want to switch to other framework  it will be easier
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="product")

public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="p_code")
	private int code;
	@Column(name="p_name",length=30)
	private String name;
	private double price;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	

}
