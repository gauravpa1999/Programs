package Javaprograms;

import java.util.Scanner;

public class Factorial {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to find factorial:");
		int num = sc.nextInt();
		int fact = 1;
		
		for( ; num > 0;num--) {
			fact *= num;
		}
		System.out.println("The factorial of the given number is: " + fact);
	}

}
