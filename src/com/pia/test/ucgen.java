package com.pia.test;

import java.util.Iterator;
import java.util.Scanner;

public class ucgen {

	public static void main(String[] args) {
		int yks = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("yükseklik belirle:");
		yks = input.nextInt();
		int bos=50;
		for (int i = 0; i < yks; i++) {
			for (int j=50; j>= 0;j--) {
				System.out.print(" ");
			}
			for (int x = 0; x <=i; x++) {
				System.out.print("* ");
			}
			System.out.println("");
			bos--;
		}

		
	}
}
