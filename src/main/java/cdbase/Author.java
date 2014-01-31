package cdbase;

import java.util.List;

import Db.EntityBase;

public class Author extends EntityBase {

	private String name;
	private String surname;
	private String band;
	
	
	//relacja author---Cd 
	private List<Cd> Cd;
	
	
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public String getBand() {
		return band;
	}
	public void setBand(String band) {
		this.band = band;
	}
	
	
}
