package com.ok.case2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

import org.junit.Test;

import com.sun.org.apache.bcel.internal.generic.NEW;

public class ProxyTest {
	@Test
	public void test() {
		 TargetInterface objProxy= (TargetInterface)Proxy.newProxyInstance(
				Target.class.getClassLoader(),
				new Class[] {TargetInterface.class},
				new InvocationHandler() {
					
					@Override
					public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
						// TODO Auto-generated method stub
						 Object aObject= method.invoke(new Target(), args);
						return aObject;
						
					}
				}
				);
		 objProxy.method1();
		 String string1= objProxy.method2();
		 System.out.println(string1);
	}
}
