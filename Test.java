package org.modelmapper.array;

import java.util.ArrayList;
import java.util.Arrays;

import org.modelmapper.ModelMapper;

public class Test {
	public static void main(String[] args){
	Customer a = create();
    ModelMapper modelMapper = new ModelMapper();
    long start = System.nanoTime();
    CustomerDTO aDTO = modelMapper.map(a, CustomerDTO.class);
    long stop = System.nanoTime();
    System.out.println(stop-start);
    System.out.println(aDTO.getOrder().getManu().getName().getFirstName()+" "+aDTO.getOrder().getName().getFirstName()+" "+Arrays.toString(aDTO.getOrder().getPrice())+" "+Arrays.toString(aDTO.getOrder().getNum())+" "+Arrays.toString(aDTO.getOrder().getProd())+" "+Arrays.toString(aDTO.getAddress())+" "+aDTO.getFirstName()+" "+Arrays.toString(aDTO.getArr())+" "+aDTO.getCheck()+" "+Arrays.toString(aDTO.getA().toArray()));
	}
	
	public static Customer create(){
		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(14);
		list.add(12);
		list.add(13);
		Customer a = new Customer(new Order(new Manufacturer(new Name("Manu-firstname","Manu-lastname"),"12-10-2007",4),new Name("ABC","DEF"),new double[]{2,5,10},new int[]{10,2,5}, new String[]{"Pencil","Eraser","Pen"}),new Name("Sai Gowri", "Kumar"),new String[]{"ejefj","eglje"},100,list,new int[]{1,2,3,4});
		return a;
	}
}
