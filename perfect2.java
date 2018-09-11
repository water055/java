package homework;
// 计璝单ㄤ┮Τ计羆㎝玥计perfect number
// т100ず┮ΤЧ计

public class perfect2 {

	public static void main(String[] args) {
		for (int num = 1; num <= 100; num++) {
			int sum = 0;
			for (int i = 1; i < num; i++) {
				if (num % i == 0) {
					sum += i;
				}
			}
			if (num == sum) {
				System.out.println(sum);
			} else
				;
		}
	}
}

