package by.epamtc.module1.main;

/*
 * Даны три точки A(x1, y1), B(x2, y2) и C(x3, y3). Определить, будут ли они
 * распололжены на одной прямой.
 */

public class Bifurcation3 {

	public static void main(String[] args) {

		double result;
		double x1;
		double x2;
		double x3;
		double y1;
		double y2;
		double y3;

		x1 = 1;
		y1 = 1;
		x2 = 3;
		y2 = 3;
		x3 = 4;
		y3 = 4;

		if (((x1 == x2) && (y1 == y2)) || ((x1 == x3) && (y1 == y3)) || ((x2 == x3) && (y2 == y3))) {
			System.out.println("points lie on one straight line");
		} else {
			result = (x3 - x1) * (y2 - y1) - (y3 - y1) * (x2 - x1);

			if (result == 0) {
				System.out.println("points lie on one straight line");
			} else {
				System.out.println("points do not lie on one straight line");
			}

		}

	}

}