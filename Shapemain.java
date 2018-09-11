package homework;

public class Shapemain {

	public static void main(String[] args) {
		Circle cir = new Circle();
		cir.PI=3.14;
		cir.radius=10;
		cir.computeArea();
		cir.computeCircumference();
		
		Rectangle rec =new Rectangle();
		rec.height=5;
		rec.width=6;
		rec.computeArea();
		rec.computeCircumference();
		
	}

}
