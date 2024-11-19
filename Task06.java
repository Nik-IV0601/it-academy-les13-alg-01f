package independentWork;

public class Task06 {

	public static void main(String[] args) {

		int k1 = -30;
		int k2 = 60;
		int n = 20;
		int a = 3_000;
		int b = 60_000;
		int m = 4;
		diffCondition(k1, k2, n, a, b, m);
	}

	public static void diffCondition(int k1, int k2, int n, int a, int b, int m) {

		int count = 1;
		int t1 = (int) Math.sqrt(a + b + m);
		int t2 = m * (int) Math.sqrt(a + b);
		int t3 = (int) Math.sqrt(a * b * m);
		int t4 = m * (int) Math.sqrt(a * b);
		System.out.println("Значения, удовлетворяющие заданному условию :");
		for (int k = k1; k <= k2; k += (k2 - k1) / n) {
			int f = k*k*k + 25*k*k + 50*k + 1000;
			if ((f < t2 && f > t1) || (f < t4 && f > t3)) {
				System.out.printf("%d) %d\n", count, f);
				count++;
			} 
		}
		System.out.println("В заданном интервале значений не удовлетворяющих условию : " + (n - count + 1));
	}

}
