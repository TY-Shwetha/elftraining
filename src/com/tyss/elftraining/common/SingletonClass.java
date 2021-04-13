package com.tyss.elftraining.common;

public class SingletonClass {
	public static final SingletonClass s=new SingletonClass();
	
	private SingletonClass() {
		
	}
	
	public static SingletonClass get() {
		System.out.println(" Method ");
		return s;
	}
}
