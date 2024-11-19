package independentWork;

public class Task05 {

	public static void main(String[] args) {

		double a = 1;
		int n = 10;
		formulaSelection(a, n);
	}

	public static void formulaSelection(double a, double n) {

		int count = 1;
		System.out.println("---------------------\n" 
		                 + "| № |   x   |   y   |\n" 
				         + "--------------------");
		for (double x = -2.0 * a; count <= n; x += a / 5) {
			if (x <= 0) {
				double y = a * (Math.pow(Math.E, x / a) + Math.pow(Math.E, -x / a)) / 2;
				if (count < 10) {
					System.out.printf("| %d | %.2f | %.3f |\n" + "---------------------\n", count, x, y);
				} else {
					System.out.printf("| %d| %.2f | %.3f |\n" + "---------------------\n", count, x, y);
				}
			} else {
				double y = Math.pow(a, 3) / (0.25 * x * x + a * a);
				if (count < 10) {
					System.out.printf("| %d |  %.2f | %.3f |\n" + "---------------------\n", count, x, y);
				} else {
					System.out.printf("| %d|  %.2f | %.3f |\n" + "---------------------\n", count, x, y);
				}
			}
			count++;
		}
	}

}

