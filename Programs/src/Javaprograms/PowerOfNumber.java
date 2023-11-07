package Javaprograms;

import java.util.Scanner;

public class PowerOfNumber {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the base value:");
		int base = sc.nextInt();
		
		System.out.println("Enter the raised value:");
		int raise = sc.nextInt();
		int temp = raise;
		int ans = 1;
		
		while(raise>0) {
			ans *= base;
			raise--;
		}
		System.out.println("The " + base + " raised to " + temp + " is " + ans);
		
	}

}
