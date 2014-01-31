package cdbase;

import java.util.List;

import Db.EntityBase;

public class Cd extends EntityBase {

	private String name;
	private int price;
    
	//relacja cd---track
	private List<Track> tracks;
	//relacja cd---Author
	private Author authores;
	
	public List<Track> getTracks() {
		return tracks;
	}
	public void setTracks(List<Track> orders){
		this.tracks = tracks;
	}
	
	public Author getAuthores() {
		return authores;
	}
	
	public void setAuthores() {
		this.authores = authores;
	}
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
	
}
