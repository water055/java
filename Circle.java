package homework;

 public class Circle implements Shape{
     double radius;
	 double PI;
	 double Area;
	 public void computeArea(){
		 System.out.print("���n��:"+ PI*radius*radius +", ");
	 }
	 public void computeCircumference(){
		 System.out.print("�P����:"+ radius*2*PI +", ");
	 }
}
	
