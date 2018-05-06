package com.esp.simplealgo;

import java.util.Scanner;

public class InputScan {

	 public static void main(String[] args)
	    {
	        // Declare the object and initialize with
	        // predefined standard input object
	        Scanner sc = new Scanner(System.in);
	 
	        // String input
	        String name = sc.nextLine();
	 
	        // Character input
	        char gender = sc.next().charAt(3);
	 
	        // Numerical data input
	        // byte, short and float can be read
	        // using similar-named functions.
	        int age = sc.nextInt();
	        long mobileNo = sc.nextLong();
	        double cgpa = sc.nextDouble();
	        
	        sc.close();
	 
	        // Print the values to check if input was correctly obtained.
	        System.out.println("Name: "+name);
	        System.out.println("Gender: "+gender);
	        System.out.println("Age: "+age);
	        System.out.println("Mobile Number: "+mobileNo);
	        System.out.println("CGPA: "+cgpa);
	    }
}
