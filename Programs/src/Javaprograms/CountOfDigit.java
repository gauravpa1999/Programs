package Javaprograms;

import java.util.Scanner;

public class CountOfDigit {
	public static void main(String[] args) {
		Scanner c = new Scanner(System.in);
		System.out.println("Enter the number to count the digit:");
		int num = c.nextInt();
		int count = 0;
		
		while(num>0) {
			num/=10;
			count++;
		}
		System.out.println("The count of digit is" + " "+ count);
	}

}
