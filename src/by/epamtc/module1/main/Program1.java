package by.epamtc.module1.main;

/*
 * Найдите значение функции z = ((a - 3) * b / 2) + c.
 */

public class Program1 {

	public static void main(String[] args) {

		double a;
		double b;
		double c;
		double z;

		a = 2;
		b = 3;
		c = -6;

		z = ((a - 3) * b / 2) + c;
		System.out.printf("z = %.3f", z);

	}

}