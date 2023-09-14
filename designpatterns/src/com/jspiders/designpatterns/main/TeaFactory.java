package com.jspiders.designpatterns.main;

import java.util.Scanner;

import com.jspiders.designpatterns.creational.Beverage;
import com.jspiders.designpatterns.creational.BlackTea;
import com.jspiders.designpatterns.creational.GreenTea;
import com.jspiders.designpatterns.creational.IceTea;
import com.jspiders.designpatterns.creational.NormalTea;

public class TeaFactory {
	
	private static Beverage beverage;
	
	public static void main(String[] args) {
		
		try {
			Factory().order();
		} 
		catch (NullPointerException e) {
			e.printStackTrace();
		}
	}
	
	public static Beverage Factory() {
		System.out.println("Select Tea to Order");
		System.out.println("1. Normal Tea\n"
				+ "2. Black Tea\n"
				+ "3. Green Tea\n"
				+ "4. Ice Tea");
		
		Scanner scanner = new Scanner(System.in);
		
		int Choice = scanner.nextInt();
		
		switch (Choice) {
		case 1: {
			beverage = new NormalTea();
			break;
		}
		case 2: {
			beverage = new BlackTea();
			break;
		}
		case 3: {
			beverage = new GreenTea();
			break;
		}
		case 4: {
			beverage = new IceTea();
			break;
		}
		default:
			System.out.println("Invalid Choice...");
			System.out.println("No Tea Orderd...");
		}
		return beverage;
	}
}
