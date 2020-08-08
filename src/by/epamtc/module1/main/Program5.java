package by.epamtc.module1.main;

import java.util.Scanner;

/*
 * Дано натуральное число T, которое представляет длительность прошедшего
 * времени в секундах. Вывести HHч MMмин SSс.
 */

public class Program5 {

	public static void main(String[] args) {

		int time;
		int ss;
		int timeHelp;
		int mm;
		int hh;

		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		System.out.println("Input Time In Seconds");
		while (!sc.hasNextInt()) {
			sc.next();
			System.out.println("Input Time In Seconds");
		}
		time = sc.nextInt();

		ss = time % 60;
		timeHelp = time / 60;
		mm = timeHelp % 60;
		hh = timeHelp / 60;
		System.out.print("Result = " + hh + "h " + mm + "min " + ss + "s.");

	}

}