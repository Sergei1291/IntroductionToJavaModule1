package by.epamtc.module1.main;

import java.util.Scanner;
import static java.lang.Math.*;

/*
 * Вычислить значение выражения по формуле (все переменные принимают
 * действительные значения): (sin(x) + cos(x)) / (cos(x) - sin(x)) * tg(xy).
 */

public class Program3 {

	public static void main(String[] args) {

		double x;
		double y;
		double xRadians;
		double yRadians;
		double denominator;
		double result;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Input x: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Input x: ");
		}
		x = sc.nextDouble();

		System.out.println("Input y: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Input y: ");
		}
		y = sc.nextDouble();

		xRadians = toRadians(x);
		yRadians = toRadians(y);
		denominator = cos(xRadians) - sin(yRadians);

		if (cos(xRadians) != sin(yRadians)) {
			result = (sin(xRadians) + cos(yRadians));
			result = result * tan(toRadians(x * y)) / denominator;
			System.out.printf("Result = %.4f", result);
		} else {
			System.out.println("division by zero");
		}

	}

}