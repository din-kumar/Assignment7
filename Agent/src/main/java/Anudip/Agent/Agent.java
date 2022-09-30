package Anudip.Agent;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Agent {

	public Agent() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Agent(int id, String name, String city, double commission) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
		this.commission = commission;
	}
	@Override
	public String toString() {
		return "Agent [id=" + id + ", name=" + name + ", city=" + city + ", commission=" + commission + "]";
	}
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	
	@Id
	private int id;
	private String name;
	private String city;
	private double commission;
}
