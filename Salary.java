package assingment02;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
				Scanner sc=new Scanner(System.in);
				
				System.out.println("Enter the salary amount");
				
				int salary=sc.nextInt();
				salary+=2000;
				System.out.println(salary);
				
				salary-=2000;
				System.out.println(salary);
				
				salary*=8;
				System.out.println(salary);
				
				salary/=6;
				System.out.println(salary);
				
			}


}
