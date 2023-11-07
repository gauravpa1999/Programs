package Javaprograms;

import java.util.Scanner;

public class ReverseNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to reverse the number:");
		int num = sc.nextInt();
		int rev = 0;
		
		System.out.println("The reverse number of the given number is:");
		do {
			rev = rev * 10 + (num % 10);
			num /= 10;
		}
		while(num != 0);{
			System.out.println(rev);
		}
	}

}
