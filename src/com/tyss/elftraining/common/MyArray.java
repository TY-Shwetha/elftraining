package com.tyss.elftraining.common;

import java.util.Iterator;

public class MyArray<E> implements Iterable<E> {

	Object arr[];
	Object default_Arr[]= {};
	int size;
	
	public MyArray() {
		arr=default_Arr;
	}
	
	public MyArray(int size) {
		arr=new Object[size];
	}
	
	public boolean add(Object element) {
		arr[size++]=element;
		return true;
	}
	
	public Object get(int index) {
		return arr[index];
	}
	public void set(int index,int element) {
		arr[index]=element;
	}
	
	public Object remove(int index) {
		Object deletedValue=arr[index];
		int len=size-index-1;
		System.arraycopy(arr, index+1, arr, index, len);
		arr[--size]=0;
		return deletedValue;		
	}
	
	@Override
	public String toString() {
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]!=null) {
				System.out.println(arr[i]);
			}			
		}
		return "";
	}
	
	public int size() {
		return this.size;
	}

	@Override
	public Iterator<E> iterator() {
		
		return new MyItr();
	}
	
	class MyItr implements Iterator<E>{
		int index;
		@Override
		public boolean hasNext() {

			return (index<size)?true:false;
		}

		@Override
		public E next() {
			E e=(E) arr[index++];
			return e;
		}	
	}	
}
