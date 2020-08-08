package by.epamtc.module1.main;

/*
 * Даны два числа. Определить цифры, входящие в запись как первого так и второго
 * числа.
 */

public class Cycle8 {

	public static void main(String[] args) {

		int valueOne;
		int valueTwo;
		int valHelp;
		boolean flagOne;
		boolean flagTwo;

		valueOne = 935804;
		valueTwo = 756034821;

		for (int i = 0; i < 10; i++) {
			flagOne = false;
			valHelp = valueOne;

			while (valHelp != 0) {
				if ((valHelp % 10) == i) {
					flagOne = true;
					break;
				}
				valHelp = valHelp / 10;
			}

			flagTwo = false;
			valHelp = valueTwo;

			while (valHelp != 0) {
				if ((valHelp % 10) == i) {
					flagTwo = true;
					break;
				}
				valHelp = valHelp / 10;

			}

			if (flagOne && flagTwo) {
				System.out.print(i + " ");
			}
		}

	}

}