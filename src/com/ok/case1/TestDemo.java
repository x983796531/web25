package com.ok.case1;

import org.junit.Test;

public class TestDemo {
	@MyTest
	public void test1() {
		System.out.println("test1  running");
		
	}
	
	@MyTest
	public void test2() {
		System.out.println("test2  running");
		
	}
	
	@Test
	public void test3() {
		System.out.println("test3 running");
		
	}
}
