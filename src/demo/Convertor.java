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
		Scanner input = new Scanner(System.in);

		double celsius = input.nextDouble();
		System.out.print(celsius + " Cel " + ((celsius * 9 / 5.0) + 32) + " Far");
		converter();
		input.close();

	}

	public static void far2cel() {
		Scanner input = new Scanner(System.in);
		Double Fahrenheit = input.nextDouble();

		System.out.print(Fahrenheit + " Far" + ((Fahrenheit - 32) * (5 / 9.0)) + " Cel");
		converter();
		input.close();

	}

	public static void inch2cent() {
		Scanner input = new Scanner(System.in);

		double inches = input.nextDouble();
		double result = inches * 2.54;

		System.out.println(inches + " inches is " + result + " centimeters.");
		input.close();

	}


	public static void cent2inch() {
		Scanner input = new Scanner(System.in);

		double cent = input.nextDouble();
		double result = (cent * 0.39370079);

		System.out.println(cent + " centimeters is " + result + " inches.");
		input.close();
	}


	

	public static void pounds2kg() {
		Scanner input = new Scanner(System.in);
		
		double pounds = input.nextDouble();
		double result = (pounds * 0.45359237);
		
		System.out.println(pounds + " pounds is " + result + " kilograms.");
		input.close();

	}

	public static void kg2pounds() {
		Scanner input = new Scanner(System.in);
		
		double kg = input.nextDouble();
		double result = (kg * 2.20462262);
		
		System.out.println(kg + " kilograms is " + result + " pounds.");
		input.close();
	}

}
