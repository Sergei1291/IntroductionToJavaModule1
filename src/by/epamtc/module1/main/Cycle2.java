package by.epamtc.module1.main;

/*
 * Вычислить значение функции на отрезке [a, b] с шагом h: y = x, x > 2; y = -x,
 * x <= 2.
 */

public class Cycle2 {

	public static void main(String[] args) {

		double a;
		double b;
		double h;
		double y;
		double x;
		int i = 0;

		a = -3;
		b = 2;
		h = 0.3;

		if ((b >= a) && (h > 0)) {

			while ((a + i * h) < b) {
				x = a + i * h;

				if (x <= 2) {
					y = -x;
				} else {
					y = x;
				}

				System.out.printf("(%.4f; %.4f)\n", x, y);
				i++;
			}

			if (b <= 2) {
				y = -b;
			} else {
				y = b;
			}
			System.out.printf("(%.4f; %.4f)", b, y);
		} else {
			System.out.println("incorrect input");
		}

	}

}