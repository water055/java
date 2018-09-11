package homework;

 public class Circle implements Shape{
     double radius;
	 double PI;
	 double Area;
	 public void computeArea(){
		 System.out.print("面積為:"+ PI*radius*radius +", ");
	 }
	 public void computeCircumference(){
		 System.out.print("周長為:"+ radius*2*PI +", ");
	 }
}
	
