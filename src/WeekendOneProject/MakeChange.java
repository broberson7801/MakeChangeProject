package WeekendOneProject;

import java.util.Scanner;

public class MakeChange {

	static double totalCost, totalGiven;

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("How much did the stuff cost? ");
		totalCost = input.nextDouble();

		System.out.print("How much money did the customer tender? ");
		totalGiven = input.nextDouble();

		if (totalGiven == totalCost) {
			System.out.println("Don't give change");
		} else if (totalGiven < totalCost) {
			System.out.println("You need to give more money.");
		} else {
			giveChange();
		}

		input.close();

	}

	public static void giveChange() {
		double twenty, ten, five, one, quarter, dime, nickel, penny;
		double totalToGiveBack = totalGiven - totalCost;

		totalToGiveBack = totalGiven - totalCost;

		twenty = totalToGiveBack / 20;

		ten = (totalToGiveBack % 20) / 10;

		five = (totalToGiveBack % 20) % 10 / 5;

		one = (totalToGiveBack % 20) % 10 % 5 / 1;

		quarter = ((totalToGiveBack % 20) % 10 % 5 % 1) * 100 / 25;

		dime = ((totalToGiveBack % 20) % 10 % 5 % 1) * 100 % 25 / 10;

		nickel = ((totalToGiveBack % 20) % 10 % 5 % 1) * 100 % 25 % 10 / 5;

		penny = ((totalToGiveBack % 20) % 10 % 5 % 1) * 100 % 25 % 10 % 5 / 1;

		double totalDenominators1 = ten + five + one + quarter + dime + nickel + Math.round(penny);
		double totalDenominators2 = totalDenominators1 - ten;
		double totalDenominators3 = totalDenominators2 - five;
		double totalDenominators4 = totalDenominators3 - one;
		double totalDenominators5 = totalDenominators4 - quarter;
		double totalDenominators6 = totalDenominators5 - dime;
		double totalDenominators7 = totalDenominators6 - nickel;
		double totalDenominators8 = totalDenominators7 - Math.round(penny);

		for (totalToGiveBack = .01; totalToGiveBack < 1; totalToGiveBack++) {
			System.out.print("Give back ");
			if ((int) twenty == 1 & totalDenominators1 == 0) {
				System.out.print((int) twenty + " twenty. ");
			} else if ((int) twenty == 1 && totalDenominators1 > 0) {
				System.out.print((int) twenty + " twenty, ");
			} else if ((int) twenty > 1 & totalDenominators1 > 0) {
				System.out.print((int) twenty + " twenties, ");
			} else if ((int) twenty > 1 & totalDenominators1 == 0) {
				System.out.print((int) twenty + " twenties. ");
			} else {
				System.out.print("");
			}

			if ((int) ten == 1 & totalDenominators2 == 0) {
				System.out.print((int) ten + " ten. ");
			} else if ((int) ten == 1 && totalDenominators2 > 0) {
				System.out.print((int) ten + " ten, ");
			} else if ((int) ten > 1 & totalDenominators2 > 0) {
				System.out.print((int) ten + " tens, ");
			} else if ((int) ten > 1 & totalDenominators2 == 0) {
				System.out.print((int) ten + " ten. ");
			} else {
				System.out.print("");
			}

			if ((int) five == 1 & totalDenominators3 == 0) {
				System.out.print((int) five + " five. ");
			} else if ((int) five == 1 && totalDenominators3 > 0) {
				System.out.print((int) five + " five, ");
			} else if ((int) five > 1 & totalDenominators3 > 0) {
				System.out.print((int) five + " fives, ");
			} else if ((int) five > 1 & totalDenominators3 == 0) {
				System.out.print((int) five + " fives. ");
			} else {
				System.out.print("");
			}

			if ((int) one == 1 & totalDenominators4 == 0) {
				System.out.print((int) one + " one. ");
			} else if ((int) one == 1 && totalDenominators4 > 0) {
				System.out.print((int) one + " one, ");
			} else if ((int) one > 1 & totalDenominators4 > 0) {
				System.out.print((int) one + " ones, ");
			} else if ((int) one > 1 & totalDenominators4 == 0) {
				System.out.print((int) one + " ones. ");
			} else {
				System.out.print("");
			}

			if ((int) quarter == 1 & totalDenominators5 == 0) {
				System.out.print((int) quarter + " quarter. ");
			} else if ((int) quarter == 1 && totalDenominators5 > 0) {
				System.out.print((int) quarter + " quarter, ");
			} else if ((int) quarter > 1 & totalDenominators5 > 0) {
				System.out.print((int) quarter + " quarters, ");
			} else if ((int) quarter > 1 & totalDenominators5 == 0) {
				System.out.print((int) quarter + " quarters. ");
			} else {
				System.out.print("");
			}

			if ((int) dime == 1 & totalDenominators6 == 0) {
				System.out.print((int) dime + " dime. ");
			} else if ((int) dime == 1 && totalDenominators6 > 0) {
				System.out.print((int) dime + " dime, ");
			} else if ((int) dime > 1 & totalDenominators6 > 0) {
				System.out.print((int) dime + " dimes, ");
			} else if ((int) dime > 1 & totalDenominators6 == 0) {
				System.out.print((int) dime + " dimes. ");
			} else {
				System.out.print("");
			}

			if ((int) nickel == 1 & totalDenominators7 == 0) {
				System.out.print((int) nickel + " nickel. ");
			} else if ((int) nickel == 1 && totalDenominators7 > 0) {
				System.out.print((int) nickel + " nickel, ");
			} else if ((int) nickel > 1 & totalDenominators7 > 0) {
				System.out.print((int) nickel + " nickels, ");
			} else if ((int) nickel > 1 & totalDenominators7 == 0) {
				System.out.print((int) nickel + " nickels. ");
			} else {
				System.out.print("");
			}

			if (Math.round(penny) == 1 & totalDenominators8 == 0) {
				System.out.print(Math.round(penny) + " penny. ");
			} else if (Math.round(penny) == 1 && totalDenominators8 > 0) {
				System.out.print(Math.round(penny) + " penny. ");
			} else if (Math.round(penny) > 1 & totalDenominators8 > 0) {
				System.out.print(Math.round(penny) + " pennies. ");
			} else if (Math.round(penny) > 1 & totalDenominators8 == 0) {
				System.out.print(Math.round(penny) + " pennies. ");
			} else {
				System.out.print("");
			}

		}
	}
}
