package com.ok.case2;

public class Target implements TargetInterface {

	@Override
	public void method1() {
		// TODO Auto-generated method stub
		System.out.println("method1 is running");
	}

	@Override
	public String method2() {
		// TODO Auto-generated method stub
		System.out.println("method2 is running");
		return "method2";
	}

	@Override
	public int method3(int x) {
		// TODO Auto-generated method stub
		return x;
	}

}
