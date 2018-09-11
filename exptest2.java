package homework;

public class exptest2 {

	public static void main(String[] args) {
		int X = 0, Y = 0;
		for (int n = 1; n <= 49; n += 2) {
			X += Math.pow(n, 2);
		}
		for (int i = 2; i <= 50; i += 2) {
			Y += Math.pow(i, 2);
		}
		int Z = X - Y;
		System.out.println(Z);
	}
}