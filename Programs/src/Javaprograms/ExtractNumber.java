package Javaprograms;

import java.util.Scanner;

public class ExtractNumber {
	public static void main(String[]args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number to extract:");
		int num = sc.nextInt();
		System.out.println("The extracted number is:");
		while(num > 0) {
			int rem = num % 10;
			
			System.out.println(rem);
			num /= 10; 
		}
	}

}
