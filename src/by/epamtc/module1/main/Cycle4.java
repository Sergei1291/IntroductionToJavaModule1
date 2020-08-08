package by.epamtc.module1.main;

import java.math.BigInteger;

/*
 * Составить программу нахождения произведения квадратов первых двухсот чисел.
 */

public class Cycle4 {

	public static void main(String[] args) {

		long value;
		value = 1L;
		int j = 1;

		while (value > 0) {
			value *= j * j;
			j++;
		}

		System.out.println("Perepolnenie long pri j = " + (--j));

		BigInteger result = BigInteger.ONE;

		for (int i = 1; i <= 200; i++) {
			result = result.multiply(BigInteger.valueOf(i * i));
		}

		System.out.println(result);

	}

}