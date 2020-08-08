package by.epamtc.module1.main;

import java.util.Scanner;

/*
 * Для каждого натурального числа в промежутке от m до n вывести все делители,
 * кроме единицы и самого числа. m и n вводятся с клавиатуры.
 */

public class Cycle7 {

	public static void main(String[] args) {

		int valueM;
		int valueN;
		boolean flag;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		do {
			System.out.println("Input m, n: m < n.");

			System.out.println("Input m");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Input m");
			}
			valueM = sc.nextInt();

			System.out.println("Input n");
			while (!sc.hasNextInt()) {
				sc.next();
				System.out.println("Input n");
			}
			valueN = sc.nextInt();

		} while ((valueM > valueN) || ((valueM < 0) || (valueN < 0)));

		while (valueM <= valueN) {
			System.out.print("number's dividers " + valueM + " - ");
			flag = true;

			for (int i = 2; i < valueM; i++) {
				if ((valueM % i) == 0) {
					System.out.print(i + ";  ");
					flag = false;
				}
			}

			valueM++;
			if (flag) {
				System.out.println("no dividers");
			} else {
				System.out.print("\n");
			}
		}

	}

}