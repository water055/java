package homework;

import java.util.Scanner;

public class factor2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J��ơG");
		int n = scanner.nextInt();
		int i = 1;
		while (i <= n) {
			if (n % i == 0) {
				System.out.print(i + "\f");

			}
			i++;
		}
	}
}