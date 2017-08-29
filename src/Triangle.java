
public class Triangle {

	private int sides;
	private double a;
	private double b;
	private double c;
	
	public Triangle(int sides, double a, double b, double c){
		this.sides = sides;
		this.a = a;
		this.b = b;
		this.c = c;
		
	}
	
	public double getBase(){
		return b;
	}
	
	public double getHeight() throws Exception{
		
		if(isATriangle()){
			double angle = Math.atan(c/a);
			double height = angle * a;
			return height;
		}
		else {
			throw new Exception(" The data that you provide does not form a triangle.");
		}
	}
	
	public boolean isATriangle(){
		
		if((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a)){
			return true;			
		}
		return false;
		
	}
}
