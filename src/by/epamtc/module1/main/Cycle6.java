package by.epamtc.module1.main;

/*
 * Вывести на экран соответствий между символами и их численными обозначениями в
 * памяти компьютера.
 */

public class Cycle6 {

	public static void main(String[] args) {

		char symbol;

		// 31..200 elements of the table
		for (int i = 1, j = 31; j <= 200; i++, j++) {
			symbol = (char) j;
			System.out.print(j + " " + symbol + ";   ");
			if ((i % 20) == 0) {
				System.out.println();
			}
		}

	}

}