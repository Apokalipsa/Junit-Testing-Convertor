package demo;

import java.util.Scanner;

public class Convertor {
	public static void main(String[] args) {
		// Convertor Program created by Amila, Dijana & Amel
		System.out.print(" === Converting Program ===\n");
		converter();
	}

	private static void converter() {

		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter 1 for Kilograms to Pounds" + "\nEnter 2 for Pounds to Kilograms"
				+ "\nEnter 3 for Centimeters to Inches" + "\nEnter 4 for Inches to Centimerti"
				+ "\nEnter 5 for Celsius to Fahrenheit" + "\nEnter 6 for Fahrenheit to Celsius"
				+ "\nEnter Something else for exit " + "\nYour Option:");
		int selection = input.nextInt();

		if (selection == 1) {
			System.out.print("Enter the number of Kg: ");
			kg2pounds();

		} else if (selection == 2) {
			System.out.print("Enter the number of Pounds: ");
			pounds2kg();

		} else if (selection == 3) {
			System.out.print("Enter the number of Centimeters:");
			cent2inch();

		} else if (selection == 4) {
			System.out.print("Enter the number of Inches:");
			inch2cent();

		} else if (selection == 5) {
			System.out.print("Enter a degree in Fahrenheit:");
			far2cel();

		} else if (selection == 6) {
			System.out.print("Enter a degree in Celsius:");
			cel2far();

		} else {
			System.out.print("Bye..");
		}
		input.close();
	}

	public static void cel2far() {
		// TODO Auto-generated method stub

	}

	public static void far2cel() {
		// TODO Auto-generated method stub

	}

	public static void inch2cent() {
		// TODO Auto-generated method stub

	}

<<<<<<< HEAD
	public static void cent2inch() {
		Scanner input = new Scanner(System.in);

		double cent = input.nextDouble();
		double result = (cent * 0.39370079);

		System.out.println(cent + " centimeters is " + result + " inches.");
		input.close();
=======
	public static void cent2inch(double d) {
		// TODO Auto-generated method stub
>>>>>>> testing

	}

	public static void pounds2kg() {
		// TODO Auto-generated method stub

	}

	public static void kg2pounds() {
		// TODO Auto-generated method stub

	}

}
