package org.modelmapper.array;

public class Order {
	private double[] price;
	private String[] prod;
	private int[] num;
	private Name name;
	private Manufacturer manu;
		
	public Manufacturer getManu() {
		return manu;
	}

	public void setManu(Manufacturer manu) {
		this.manu = manu;
	}


	public Name getName() {
		return name;
	}

	public void setName(Name name) {
		this.name = name;
	}

	public double[] getPrice() {
		return price;
	}

	public void setPrice(double[] price) {
		this.price = price;
	}

	public Order(Manufacturer man, Name name, double[] price, int[] num, String[] prod){
		this.name = name;
		this.manu = man;
		this.price = price;
		this.prod = prod;
		this.num = num;
	}
	
	public String[] getProd() {
		return prod;
	}
 	public void setProd(String[] prod) {
		this.prod = prod;
	}
	public int[] getNum() {
		return num;
	}
	public void setNum(int[] num) {
		this.num = num;
	}
}
