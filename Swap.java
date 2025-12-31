package assingment02;

import java.util.Scanner;

public class Swap {

	public static void main(String[] args) {
		
		Scanner cs = new Scanner(System.in) ;
		
		System.out.println("Enter the value for A :");
		
		int a =cs.nextInt();
		
        System.out.println("Enter the value for B :");
		
		int b =cs.nextInt();
		
         System.out.println("Enter the value for C :");
		
		int c =cs.nextInt();
		
		a=b;
		b=c;
		c=a;
		
		System.out.println("Value for A is :" + a);
		
		System.out.println("Value for B is :" + b);
		
		System.out.println("Value for C is :" + c);
		
		
		
		cs.close();
		

	}

}
