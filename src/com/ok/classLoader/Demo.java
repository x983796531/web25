package com.ok.classLoader;

public class Demo {
	public static void main(String[] args) {
		Class class1= Demo.class;
		ClassLoader classLoader = class1.getClassLoader();
		String path = classLoader.getResource("com/ok/classLoader/jdbc.properties").getPath();
		System.out.println(path);
	}
}
