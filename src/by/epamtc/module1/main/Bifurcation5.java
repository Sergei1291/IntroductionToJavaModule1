package by.epamtc.module1.main;

/*
 * Вычислить значение функции F(x) = x^2 - 3x + 9, если x <= 3, F(x) = 1/(x^3 +
 * 6), если x > 3.
 */

public class Bifurcation5 {

	public static void main(String[] args) {

		double x;
		double result;

		x = 2;

		if (x > 3) {
			result = Math.pow((Math.pow(x, 3) + 6), -1);
		} else {
			result = x * x - 3 * x + 9;
		}

		System.out.printf("Function F(x) = %.4f", result);

	}

}