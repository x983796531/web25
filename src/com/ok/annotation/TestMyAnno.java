package com.ok.annotation;

public class TestMyAnno {
	@MyAnno(name = "zhangsan")
	public void  show(String str) {
		System.out.println("show is running");
	}
}
