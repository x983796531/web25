package com.ok.annotation;

public @interface MyAnno {
	String name();
	int age() default 25;
}
