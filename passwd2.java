package homework;

import java.util.Scanner;

public class passwd2 {

	public static void main(String[] args) {
		final String PASSWORD = "1234";
		int attempted = 3;
		boolean authenticated = false;
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i < attempted; i++) {
			System.out.println("�п�J�K�X:");
			String input = kb.nextLine();
			if (PASSWORD.equals(input)) {
				System.out.println("�K�X��J���T�A�w��ϥΥ��t��!!");
				authenticated = true;
				break;
			}
		}
		kb.close();

		if (!authenticated) {
			System.out.println("�K�X��J�W�L�T��!!");
		}

	}

}
