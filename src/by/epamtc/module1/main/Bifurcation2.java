package by.epamtc.module1.main;

/*
 * Найти max{min(a, b), min(c, d)}.
 */

public class Bifurcation2 {

	public static void main(String[] args) {

		double valueA;
		double valueB;
		double valueC;
		double valueD;
		double resultOne;
		double resultTwo;

		valueA = 2;
		valueB = 7;
		valueC = 3;
		valueD = 4;

		if (valueA >= valueB) {
			resultOne = valueB;
		} else {
			resultOne = valueA;
		}

		if (valueC >= valueD) {
			resultTwo = valueD;
		} else {
			resultTwo = valueC;
		}

		if (resultOne >= resultTwo) {
			System.out.println("max{min(A,B), min(C,D)} = " + resultOne);
		} else {
			System.out.println("max{min(A,B), min(C,D)} = " + resultTwo);
		}

	}

}