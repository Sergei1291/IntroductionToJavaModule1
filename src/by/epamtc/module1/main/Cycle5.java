package by.epamtc.module1.main;

/*
 * Даны числовой ряд и некоторое число e. Найти сумму тех членов ряда, модуль
 * которых больше или равен заданоому e. Общий член ряда имеет вид: An = 1/(2^n)
 * * + 1/(3^n).
 */

public class Cycle5 {

	public static void main(String[] args) {

		double e;
		double result = 0;
		double aN = 1. / 2 + 1. / 3;
		int i = 1;

		e = 0.0001;

		while (aN >= e) {
			result += aN;
			i++;
			aN = 1 / (Math.pow(2, i)) + 1 / (Math.pow(3, i));
		}

		System.out.printf("the sum of the members of a number series " + "less than %f = %f", e, result);

	}

}