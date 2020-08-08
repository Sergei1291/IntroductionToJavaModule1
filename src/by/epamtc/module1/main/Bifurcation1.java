package by.epamtc.module1.main;

/*
 * Даны два угла треугольника (в градусах). Определить, существует ли такой
 * треугольник, и если да, то будет ли он прямоугольным.
 */

public class Bifurcation1 {

	public static void main(String[] args) {

		double angleA;
		double angleB;
		double angleC;

		angleA = 60;
		angleB = 40;

		if ((angleA > 0) && (angleB > 0) && ((angleA + angleB) < 180)) {
			System.out.println("the triangle exist");
			angleC = 180 - (angleA + angleB);

			if ((angleA == 90) || (angleB == 90) || (angleC == 90)) {
				System.out.println("the right triangle ");
			} else {
				System.out.println("the triangle is not right");
			}

		} else {
			System.out.println("the triangle does not exist");
		}

	}

}