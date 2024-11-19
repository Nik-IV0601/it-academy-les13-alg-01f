package independentWork;

public class Task01 {

	public static void main(String[] args) {

		double x = 0.5;
		System.out.println(toFormula(x));
				
	}

	public static double toFormula(double x) {

		double f = Math.pow(Math.E, 1.1*x) - Math.abs( Math.sin(x* Math.PI / (x + 2.0/3)) ) + 1.7;
		return f;
	}

}
