package org.modelmapper.array;

public class Manufacturer {
	private Name name;
	private String date;
	private int rating;
	public Name getName() {
		return name;
	}
	public void setName(Name name) {
		this.name = name;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public int getRating() {
		return rating;
	}
	public void setRating(int rating) {
		this.rating = rating;
	}
	public Manufacturer(Name name, String date, int rating) {
		this.name = name;
		this.date = date;
		this.rating = rating;
	}
}
