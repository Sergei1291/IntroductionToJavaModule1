package by.epamtc.module1.main;

import java.util.Scanner;

/*
 * Для данной области составить линейную программу, которая печатает true, если
 * точка с координатами (x, y) принадлежит закрашенной области и false - в
 * противном случае.
 */

public class Program6 {

	public static void main(String[] args) {

		int x;
		int y;
		boolean regionOne;
		boolean regionTwo;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Input x: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Input x: ");
		}
		x = sc.nextInt();

		System.out.println("Input y: ");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Input y: ");
		}
		y = sc.nextInt();

		regionOne = ((x >= -2) && (x <= 2)) && ((y >= 0) && (y <= 4));
		regionTwo = ((x >= -4) && (x <= 4)) && ((y >= -3) && (y <= 0));
		System.out.print(regionOne || regionTwo);

	}

}