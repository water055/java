package homework;
// 利用for迴圏計算12-22+32-42+…+492-502的值
public class expression1 {

	public static void main(String[] args) {
		int X = 0, Y = 0; //第1數命名 x,第2數命名 y
		for (int n = 1; n <= 49; n += 2) {
			X += (n * n);
		}     //1數最大只到49,隔下次方程次是+2

		for (int i = 2; i <= 50; i += 2) {
			Y += (i * i);
		}    //2數最大只到50,隔下次方程次是+2

		int Z = X - Y;
		System.out.println(Z);

	}
}
