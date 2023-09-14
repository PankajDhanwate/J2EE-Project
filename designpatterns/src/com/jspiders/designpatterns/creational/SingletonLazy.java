package com.jspiders.designpatterns.creational;

public class SingletonLazy {
	
	private static SingletonLazy singletonLazy;
	
	private SingletonLazy() {
		System.out.println("Constructor Accessed...");
	}
	
	 public static SingletonLazy getObject() {
		 if (singletonLazy == null) {
			singletonLazy = new SingletonLazy();
		}
		 return singletonLazy;
	 }

}
