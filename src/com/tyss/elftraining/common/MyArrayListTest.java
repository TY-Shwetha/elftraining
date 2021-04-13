package com.tyss.elftraining.common;

public class MyArrayListTest {

	public static void main(String[] args) {
		
		MyArray<Integer> myarray=new MyArray<Integer>(5);
		myarray.add(40);
		myarray.add(50);
		myarray.add(30);
		myarray.add(10);
		myarray.add(20);
		
		System.out.println(myarray);
		System.out.println("--------------------------");
		for (int i = 0; i < myarray.size(); i++) {
			System.out.println(myarray.get(i));
		}
		
		/*
		 * for (Integer itrarray : myarray) { System.out.println(itrarray); }
		 */
	}
}
