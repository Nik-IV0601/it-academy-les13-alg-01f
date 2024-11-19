package independentWork;

public class Task03 {

	public static void main(String[] args) {
		double x = 0.5;
		double n = 20.0;
		System.out.printf(" %.5f ", sumOfProducts(x, n));
	}

	public static double sumOfProducts(double x, double n) {

		double factor1 = Math.sqrt(Math.PI * n);
		double factor2 = 0;
		for (double k = 1.0; k <= n; k++) {
			factor2 += (Math.sin(k * x / 2.0) + Math.sin((k * x - 1.0) / 2.0)) / Math.pow(Math.E, x - 1.0 / k);
		}
		return factor1 * factor2;
	}

}
