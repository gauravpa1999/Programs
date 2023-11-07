package Patternprograms;

import java.util.Scanner;

public class Pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Length of the rectangle:");
		int l = sc.nextInt();
		
		System.out.println("Enter the Breadth of the rectangle:");
		int b = sc.nextInt();
		
		for (int i = 0 ; i <= l; i++) {
			for (int j = 0 ; j <= b ; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
