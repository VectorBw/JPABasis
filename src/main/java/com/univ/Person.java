package com.univ;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import javax.persistence.*;

@Entity
@Table(name = "per")
public class Person {
	
	long id;
	String name;
	Date date;

	Collection<Rent> Rents = new ArrayList<Rent>();
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Temporal(TemporalType.DATE)
	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	@OneToMany(mappedBy = "Person")
	public Collection<Rent> getRents() {
		return Rents;
	}

	public void setRents(Collection<Rent> rents) {
		Rents = rents;
	}
	public void addRents( Rent rent ){
		this.getRents().add(rent);
		rent.person = this;
	}

}
