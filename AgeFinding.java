package assingment02;

import java.util.Scanner;

public class AgeFinding {

	public static void main(String[] args) {
		
		
		Scanner sr = new Scanner(System.in);
		
		System.out.println("Enter the Age :");
		
		int age = sr.nextInt();
		
		if (age>=18 && age<=60) {
			
			System.out.println(" Eligiable age");
		
		}
		else {
			System.out.println("Not Eligiable age");
	
		}
		
		sr.close();

	}

}
