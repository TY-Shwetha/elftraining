package com.tyss.elftraining.common;

public class MyException {

	public static void main(String[] args) {
		System.out.println("Main");
		
		MyException myex1=new MyException();
		myex1=null;
		if(myex1 !=null) {
		myex1.run();
		}

	}

	void run() {
		System.out.println("Run");
	}
}
