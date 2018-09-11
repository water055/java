package homework;

import java.util.Scanner;

public class passwd2 {

	public static void main(String[] args) {
		final String PASSWORD = "1234";
		int attempted = 3;
		boolean authenticated = false;
		Scanner kb = new Scanner(System.in);
		for (int i = 0; i < attempted; i++) {
			System.out.println("請輸入密碼:");
			String input = kb.nextLine();
			if (PASSWORD.equals(input)) {
				System.out.println("密碼輸入正確，歡迎使用本系統!!");
				authenticated = true;
				break;
			}
		}
		kb.close();

		if (!authenticated) {
			System.out.println("密碼輸入超過三次!!");
		}

	}

}
