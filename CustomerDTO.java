package org.modelmapper.array;

import java.util.ArrayList;

public class CustomerDTO {
	private int check;
	private String firstName;
	private String lastName;
	private ArrayList<Integer> a;
	private int[] arr;
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

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String customerFirstName) {
		this.firstName = customerFirstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String customerLastName) {
		this.lastName = customerLastName;
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

	public void setCheck(int ch) {
		this.check = ch;
	}

	public ArrayList<Integer> getA() {
		return a;
	}

	public void setA(ArrayList<Integer> a) {
		this.a = a;
	}
}
