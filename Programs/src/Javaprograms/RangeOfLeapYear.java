package Javaprograms;

import java.util.Scanner;

public class RangeOfLeapYear {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the starting number:");
		int start = sc.nextInt();
		
		System.out.println("Enter the ending year:");
		int end = sc.nextInt();
		
		for(int i = start; i <=end; i++) {
			if(i % 4 == 0 && i % 100 != 0 || i % 400== 0)
				System.out.println(i);
		}
			
	}

}