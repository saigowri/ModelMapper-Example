package org.modelmapper.array;

import java.util.ArrayList;

import org.modelmapper.array.Name;

public class Customer {
	private int check;
	private ArrayList<Integer> a;
	private int[] arr;
	private Name name;
	private String[] address;
	private Order order;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public String[] getAddress() {
		return address;
	}

	public void setAddress(String[] address) {
		this.address = address;
	}

	public Name getName() {
	    return name;
	  }

	  public void setName(Name name) {
	    this.name = name;
	  }
	
	public int[] getArr() {
		return arr;
	}

	public void setArr(int[] arr) {
		this.arr = arr;
	}

	public int getCheck() {
		return check;
	}

	public void setCheck(int check) {
		this.check = check;
	}

	public Customer(Order o, Name n, String[] address, int c, ArrayList<Integer> ar, int[] arr){
		this.name = n;
		this.order = o;
		this.a = ar;
		this.check = c;
		this.arr = arr;
		this.address = address;
	}
	
	public ArrayList<Integer> getA() {
		return a;
	}

	public void setA(ArrayList<Integer> ar) {
		this.a = ar;
	}
	
}
