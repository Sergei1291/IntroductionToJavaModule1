package by.epamtc.module1.main;

import java.util.Scanner;

/*
 * Напишите программу, где пользователь вводит любое целое положительное число,
 * а программа суммирует все числа от 1 до введенного пользователем числа.
 */

public class Cycle1 {

	public static void main(String[] args) {

		int valueA;
		int result = 0;
		int i = 0;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Input INT A > 0 ");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Input INT A > 0 ");
			}

			valueA = sc.nextInt();
		} while (valueA <= 0);

		while (i <= valueA) {
			result += i++;
		}
		System.out.println("Sum 1.." + valueA + " = " + result);

	}

}