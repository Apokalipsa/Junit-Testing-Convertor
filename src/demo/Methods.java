package demo;



public class Methods {
	
	public double cel2far(double celsius) {
		return ((celsius * 1.8) + 32);
	

	}

	public double far2cel(double Fahrenheit) {
		return ((Fahrenheit / 1.8) - 32);

	}

	public  double inch2cent(double inches) {
		return (inches * 2.54);

	}

	public  double cent2inch(double cent) {

		return (cent * 0.39370079);

	}

	public double pounds2kg(double pounds) {

		return (pounds * 0.45359237);

	}

	public double kg2pounds(double kg) {

		return (kg * 2.20462262);

	}
}
