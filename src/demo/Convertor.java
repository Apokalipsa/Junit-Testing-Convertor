package demo;

import java.util.Scanner;

public class Convertor {
	public static void main(String[] args) {
		
		System.out.print(" === Converting Program ===\n");
		convertor();
		
	}

	public static void convertor() {

		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter 1 for Kilograms to Pounds" + "\nEnter 2 for Pounds to Kilograms"
				+ "\nEnter 3 for Centimeters to Inches" + "\nEnter 4 for Inches to Centimerti"
				+ "\nEnter 5 for Celsius to Fahrenheit" + "\nEnter 6 for Fahrenheit to Celsius"
				+ "\nEnter Something else for exit " + "\nYour Option:");
		int selection = input.nextInt();
		
		Methods  metode = new Methods ();
		
		switch (selection) {
		case 1:
			System.out.print("Enter the number of Kg: ");
			double kg = input.nextDouble();
			System.out.print(kg + " kg is: " + metode.kg2pounds(kg) + " pounds");

			break;
		case 2:
			System.out.print("Enter the number of Pounds: ");
			double pounds = input.nextDouble();
			System.out.print(pounds + " pounds is: " + metode.pounds2kg(pounds) + " kg");

			break;
		case 3:
			System.out.print("Enter the number of Centimeters:");
			double cm = input.nextDouble();
			System.out.print(cm + " cm is: " + metode.cent2inch(cm) + " inches");

			break;
		case 4:
			System.out.print("Enter the number of Inches:");
			double inch = input.nextDouble();
			System.out.print(inch + " inches is: " + metode.inch2cent(inch) + " cm");

			break;
		case 5:
			System.out.print("Enter a degree in Fahrenheit:");
			double fahr=input.nextDouble();
			System.out.print(fahr + " fahrenheit is: " + metode.far2cel(fahr) + " Cel");
			break;
		case 6:
			System.out.print("Enter a degree in Celsius:");
			double cel=input.nextDouble();
			System.out.print(cel + " celsius is: " + metode.cel2far(cel) + " Far");
			break;

		case 7: {
			System.out.println("Hvala Vam na koristenju nasih usluga! ");
			System.exit(1);
		}

		default:
			System.out.print("Bye..");
			
		}
		input.close();

	}
	

}

