package Javaprograms;

import java.util.Scanner;

public class PalindromeNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to check whether it is palindrome or not:");
		int num = sc.nextInt();
		int temp = num;
		int rev = 0;
		
		while(num != 0) {
			rev = rev * 10 + (num%10);
			num /= 10;
		}
		
		if(temp == rev) {
			System.out.println("The given number is palindrome number.");
		}
		else {
			System.out.println("The given number is not palindrome number.");
		}
			
		
	}
	

}
