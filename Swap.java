package assingment02;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
			
				System.out.println("Enter the first value:");
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter the second value:");
				
				int a=sc.nextInt();
				
				int b=sc.nextInt();
				
				System.out.println("Before Swapping: "+"a="+a+" "+"b="+b);
				
                a=a+b;
				
				b=a-b;
				
				a=a-b;
				
				
				System.out.println("After Swapping:   "+"a="+a+"b="+b);
				
				
				
				
             sc.close();
             
			  }

		

	         }


