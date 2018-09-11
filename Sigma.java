package homework;

public class Sigma {

	static double my_fun(double x, int n) {
		double fac = 1;
		double sum = 0;
		for (double i = 1; i <= n; i++) {
			fac = fac * x;
			sum = sum + 1 / fac;
		}
		return sum;
	}
	
}

