
public class Shape<T>{
	
	private T shape;
	
	public Shape(T shape) {
		this.shape = shape;
	}
	
	public double getArea(int sides, double base, double height){
		
		double area = 0;
		
		if(sides == 3){
			area = 0.5 * base * height;
		}
		
		else if(sides == 4){
			area = base * height;
		}
		
		return area;
	}
	
	public double getPerimeter(double side1, double side2, double side3, double side4){
		return side1 + side2 + side3 + side4;
	}
	
	public void scaleShape(){
		
	}
	
}
