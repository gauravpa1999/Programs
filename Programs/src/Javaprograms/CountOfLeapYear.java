package Javaprograms;

import java.util.Scanner;

public class CountOfLeapYear {
	public static void main(String[] args) {
		Scanner g = new Scanner(System.in);
		System.out.println("Enter the starting year:");
		int start = g.nextInt();
		
		System.out.println("Enter the last year:");
		int end = g.nextInt();
		int temp = start;
		int count = 0;
		
		while(start <= end) {
			if((start % 4 == 0 && start % 100 != 0 ) || start % 400 == 0) {
				count++;
			}
			start++;
		}
		System.out.println("The count of the leap years from the given range are "+ count);
	}

}
