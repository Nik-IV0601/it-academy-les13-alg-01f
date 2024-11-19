package independentWork;

public class Task07 {

	public static void main(String[] args) {

		int n = 4;
		double x1 = 10;
		double hx = 10;
		int m = 4;
		double z1 = 5;
		double hz = 1.1;
		functionTwoVariables(n, x1, hx, m, z1, hz);
	}

	public static void functionTwoVariables(int n, double x1, double hx, int m, double z1, double hz) {

		double[][] arr = new double[n + 1][m + 1];
		double x = x1 - hx;
		double z = z1 - hz;
		for (int i = 0; i < arr.length; i++, z += hz) {
			for (int j = 0; j < arr[i].length; j++, x += hx) {
				if (i == 0 && j != 0) {
					arr[0][j] = x;
				} else if (j == 0 && i != 0) {
					arr[i][0] = z;
				} else {
					arr[i][j] = Math.sqrt(arr[i][0] * arr[i][0] + arr[0][j] * arr[0][j]) * Math.log(arr[i][0])
							+ Math.abs(Math.log(arr[i][0]))
									/ Math.sqrt(arr[0][j] * arr[0][j] - arr[i][0] * arr[i][0] + 3.2);
				}
			}
		}
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				if (i == 0 && j == 0) {
					System.out.print(" z\\x ");
				} else if (i == 0 && j != 0) {
					System.out.printf("   %.1f   ", arr[i][j]);
				} else if (j == 0 && i != 0) {
					System.out.printf(" %.1f ", arr[i][j]);
				} else {
					System.out.printf("[%.5f]", arr[i][j]);
				}
			}
			System.out.println();
		}
	}

}
