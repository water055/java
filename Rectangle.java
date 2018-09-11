package homework;

public class Rectangle implements Shape
    {
	 int width,height ;
	 public void computeArea(){
	System.out.println("周長為:"+ (width+height)*2 +", ");
	 } 
	
	 public void computeCircumference(){
	System.out.println("面積為"+ width*height);
	}
}
