package lti.ex2;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="customer")
@SequenceGenerator(name="seqgn", sequenceName="cust_seq")
public class Customer {

	@Id
	@GeneratedValue(generator="seqgn")
	@Column(name="cust_id")
	
	private int custId;
	@Column(name="cust_name",length=30)
	private String custName;
	@Column(name="credit_limit")
	private double creditLimit;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public double getCreditLimit() {
		return creditLimit;
	}
	public void setCreditLimit(double creditLimit) {
		this.creditLimit = creditLimit;
	}
	
	
	
}
