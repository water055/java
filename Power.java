package homework;

public class Power {

	static int math(int x, int y) {
		int result = 1;
		for (int n = 1; n <= y; n++) {
			result *= x;
		}
		return result;
	}

	public static void main(String[] args) {
		int a = 5, b = 3, c;
		c = math(a, b);
		System.out.println(c);

	}

}