package homework;

import java.util.Scanner;

public class prim {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("�п�J�@�ƭȡG");
		int input = scanner.nextInt();
		System.out.print(input + "�H�U����Ʀ�:\n");
		for (int i = 2; i <= input; i++) {
			boolean isPrime = true;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				System.out.print(i + " ");
			}
		}
	}
}