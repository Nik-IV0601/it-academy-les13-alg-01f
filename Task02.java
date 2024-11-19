//Составить программу вычисления значений функции f(x) из задачи 1 для n
//значений аргумента x, равномерно распределенных на отрезке [a, b]. Для
//проверки программы задать n = 10; a = 0.50; b = 1.00. Результаты выдать в виде
//таблицы, в каждой строке порядковый номер, значение аргумента и значение
//функции с шестью знаками после запятой.
package independentWork;

public class Task02 {

	public static void main(String[] args) {

		double a = 0.5;
		double b = 1.0;
		int n = 10;
		printTable(a, b, n);

	}

	public static void printTable(double a, double b, int n) {
		
		int count = 1;
		System.out.println("----------------------\n"
				         + "| №|  x   |   f(x)   |\n"
				         + "-----------------------");
		for (double i = a; i <= b; i += (b - a) / n) {
			if (count < 10 ) {
			System.out.printf("| %d| %.2f | %.6f |\n"
					     + "----------------------\n", count, i, Task01.toFormula(i));
			} else {
				System.out.printf("|%d| %.2f | %.6f |\n"
					     + "----------------------\n", count, i, Task01.toFormula(i));
			}
			
			count++;
		}
	}

}
