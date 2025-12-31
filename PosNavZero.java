package assingment02;

import java.util.Scanner;

public class PosNavZero {

	public static void main(String[] args) {
		
		//finding negative  , positive number and zero.
	
		 Scanner one = new Scanner(System.in);
		
		 System.out.println("Enter the value of A :");
		
		 int a= one.nextInt();
		
		if(a<0) {
			
			System.out.println("It is a negative number :" + a);
		}
		
		else if(a>0){
			
			System.out.println("it's  a  positive number :" + a);
		}
		
		else {
			
			System.out.println("It's equal to zero");
		}
		
		one.close();
		
		
		

	}

}
