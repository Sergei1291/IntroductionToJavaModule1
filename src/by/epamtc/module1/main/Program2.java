package by.epamtc.module1.main;

import java.util.Scanner;

/*
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): (b + корень(b^2 + 4ac)) / (2a) - a^3 * c + b^(-2).
 */

public class Program2 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double x;
		double result;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Input a: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Input a: ");
		}
		a = sc.nextDouble();

		System.out.println("Input b: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Input b: ");
		}
		b = sc.nextDouble();

		System.out.println("Input c: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Input c: ");
		}
		c = sc.nextDouble();

		if ((a != 0) && (b != 0)) {
			x = b * b + 4 * a * c;

			if (x >= 0) {
				result = (b + Math.sqrt(x)) / (2 * a);
				result = result - Math.pow(a, 3) * c + Math.pow(b, -2);
				System.out.printf("result = %.4f\n", result);
			} else {
				System.out.println("Pod kornem - minus");
			}

		} else {
			System.out.println("division by zero");
		}

	}

}