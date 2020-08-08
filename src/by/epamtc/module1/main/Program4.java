package by.epamtc.module1.main;

import java.util.Scanner;

/*
 * Дано действительное число R вида nnn.ddd (три цифровых разряда в дробной и
 * целой частях). Поменять местами дробную и целую части числа и вывести
 * полученное значение числа.
 */

public class Program4 {

	public static void main(String[] args) {

		double x;
		double result;
		int val;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Input nnn,ddd: ");
		while (!sc.hasNextDouble()) {
			sc.next();
			System.out.println("Input nnn,ddd: ");
		}
		x = sc.nextDouble();

		val = (int) x;
		result = (x * 1000) % 1000;
		result = result + val / 1000.;
		System.out.print("Result = " + result);

	}

}