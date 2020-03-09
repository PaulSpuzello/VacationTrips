package vacation.beans;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Vacation {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private double days;
	private int people;
	
	public Vacation() {
		super();
	}
	
	public Vacation(String name) {
		
	}
	
	public Vacation(String name, double days, int people) {
		this.name = name;
		this.days = days;
		this.people = people;
	}
	
	public Vacation(int id, String name, double days, int people) {
		this.id = id;
		this.name = name;
		this.days = days;
		this.people = people;
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

	public double getDays() {
		return days;
	}

	public void setDays(double days) {
		this.days = days;
	}

	public int getPeople() {
		return people;
	}

	public void setPeople(int people) {
		this.people = people;
	}

	@Override
	public String toString() {
		return "Vacation [id=" + id + ", name=" + name + ", days=" + days + ", people=" + people + "]";
	}
}
