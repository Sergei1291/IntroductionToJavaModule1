package by.epamtc.module1.main;

/*
 * Заданы размеры A, B прямоугольного отверстия и размеры x, y, z кирпича.
 * Определить, пройдет ли кирпич через отверстие.
 */

public class Bifurcation4 {

	public static void main(String[] args) {

		double aHole;
		double bHole;
		double xBrick;
		double yBrick;
		double zBrick;

		aHole = 5;
		bHole = 4;
		xBrick = 3;
		yBrick = 5;
		zBrick = 7;

		if (((aHole > xBrick) && (bHole > yBrick)) || ((aHole > yBrick) && (bHole > xBrick))
				|| ((aHole > xBrick) && (bHole > zBrick)) || ((aHole > zBrick) && (bHole > xBrick))
				|| ((aHole > yBrick) && (bHole > zBrick)) || ((aHole > zBrick) && (bHole > yBrick))) {

			System.out.println("the brick goes into the hole");
		} else {
			System.out.println("the brick does not go into the hole");
		}

	}

}