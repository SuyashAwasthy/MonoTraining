package com.techlabs.reflection;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import java.lang.reflect.Parameter;

public class ReflectionOfString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			Class stringClass = Class.forName("java.lang.String");
			System.out.println(stringClass.getName());
			System.out.println(stringClass.getSimpleName());
			System.out.println(stringClass.getTypeName());
			
			Constructor constructors[] = stringClass.getConstructors();
			
			for(Constructor constructor:constructors) {
				System.out.println(constructor.getName());
				System.out.println(constructor.getParameterCount());
				Parameter parameters[] = constructor.getParameters();
				for(Parameter parameter:parameters) {					
					System.out.println(parameter.getName()+"\t"+parameter.getParameterizedType());
				}

			}
			
			Method methods[] = stringClass.getMethods();
			
			for(Method method:methods) {					
				System.out.println(method.getName()+"\t"+method.getParameterCount());
			}
			
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
