package com.jsp.patterns;

import java.util.Scanner;

public class Pattern5 {

	public static void main(String[] args) {

		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Enter a string: ");
	        String input = scanner.nextLine();
	        
	        for (int i = 1; i <= input.length(); i++) {
	            System.out.println(input.substring(0, i));
	        }
//
	}

}
