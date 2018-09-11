package homework;

public class amstrong {

	public static void main(String[] args) {
		int a, b, c, abc;
		for (int i = 100; i <= 999; i++) {
			a = i / 100;
			b = (i / 10) % 10;
			c = i % 10;
			abc = a * a * a + b * b * b + c * c * c;
			if (abc == i)
				System.out.println(i);
		}
	}
}
