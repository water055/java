package homework;
// �@�ӼƦr�Y�����Ҧ��]�ƪ��`�M�A�h���Ƭ�perfect number�C
// ��X100�H���Ҧ��������ơC

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

