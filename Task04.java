package independentWork;

public class Task04 {

	public static void main(String[] args) {

		int n = 9;
		double k = 3; // максимальное значение для случайных чисел
		double[][] a = new double[n][2]; // массив, содержащий координаты точек

		init(a, k);
		print(a);
		System.out.println("Точек, попавших в заданную обрасть : " + pointsInArea(a));

	}

	public static void init(double[][] a, double k) {

		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				a[i][j] =  2 - Math.random() * k;
			}
		}
	}

	public static void print(double[][] mas) {

		System.out.println("      X      Y");
		int count = 1;
		for (int i = 0; i < mas.length; i++, count++) {
			System.out.print(count + ") ");
			for (int j = 0; j < mas[i].length; j++) {
				if (mas[i][j] < 0) {
					System.out.printf("[%.2f]", mas[i][j]);
				} else {
					System.out.printf("[ %.2f]", mas[i][j]);
				}
			}
			System.out.println();
		}
		System.out.println();
	}

	public static int pointsInArea(double[][] mas) {

		int count = 0;
		for (int i = 0; i < mas.length; i++) {
			if ( ( (mas[i][0] >= -2 & mas[i][0] <= 0) & (mas[i][1] <= 2 & mas[i][1] >= 0) ) 
				^ ( (mas[i][0] <= 2 & mas[i][0] >= 0) & (mas[i][1] <= 1 & mas[i][1] >= -1) ) ) {
				count++;
			}
		}
		return count;
	}

}
