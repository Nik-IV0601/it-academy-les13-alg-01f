package independentWork;

public class Task08 {

	public static void main(String[] args) {

		double x1 = 0.1;
		double hx = 0.1;
		int n = 10;

		loopWithComplexCondition(x1, hx, n);
	}

	public static void loopWithComplexCondition(double x1, double hx, int n) {

		double x = x1;
		for (int i = 0; i <= n; x += hx, i++) {
			double y = x * x - Math.pow(Math.E, 2 * x) + 4;
			System.out.printf("%.5f\n", y);
			if (y < 0) {
				break;
			}
		}
	}

}
