package com.ok.case1;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class MyTestParser {
	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		Class class1= TestDemo.class;
		Method[] methods = class1.getMethods();
		if (methods!=null) {
			for (Method method : methods) {
				if (method.isAnnotationPresent(MyTest.class)) {
					method.invoke(class1.newInstance(), null);
				}
			}
		}
	}
}
