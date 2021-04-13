package com.tyss.elftraining.common;

public class MyArr {

	int size;
	Object ar[];
	Object default_arr[]= {};
	
	public MyArr() {
		super();
		ar=default_arr;
	}
	
	public MyArr(int size) {
		super();
		ar=new Object[size];
	}
	
	public boolean add(Object element) {
		ar[size++]=element;
		return true;
	}
	
	public Object get(int index) {
		
		return ar[index];
	}
	
	/*
	 * public Object remove(int element) { ar[index++]=element; return a; }
	 */
}
