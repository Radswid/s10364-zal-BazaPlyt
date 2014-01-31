package cdbase;

import Db.EntityBase;

public class Track extends EntityBase {

	private String name;
	private double time;
	private int number;
	
	//relacja track---cd
	private Cd cd;
	
	public Cd getCd() {
		return cd;
	}
	public void setCd(Cd cd) {
		this.cd = cd;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getTime() {
		return time;
	}
	public void setTime(double time) {
		this.time = time;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	
}
