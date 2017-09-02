
public class Shape<T>{
	
	private T shape;
	
	public Shape(T shape) {
		this.shape = shape;
	}
	
	public T getShape(){
		return shape;
	}
	
	public double getArea(double base, double height){
		
		return base * height;
	}
	
	public double getPerimeter(double side1, double side2, double side3, double side4){
		return side1 + side2 + side3 + side4;
	}
	
	public void scaleShape(){
		
	}
	
}
