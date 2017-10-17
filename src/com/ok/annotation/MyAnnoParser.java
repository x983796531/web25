package com.ok.annotation;

public class MyAnnoParser {
	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Class class1= MyAnno.class;
		class1.getMethod("show",String.class);
		
	}
}
