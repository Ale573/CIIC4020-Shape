
public class Triangle {

	private int sides= 3;
	private double a;
	private double b;
	private double c;
	
	public Triangle(double a, double b, double c) throws Exception{
	
		if(isATriangle(a, b, c)){
			this.a = a;
			this.b = b;
			this.c = c;
		}
		else {
			throw new Exception(" The data that you provide does not form a triangle.");
		}
		
	}
	
	public double getBase(){
		return b;
	}
	
	public double getHeight(){ 
		
			double angle = Math.atan(c/a);
			double height = angle * a;
			return height;
	}
	
	public boolean isATriangle(double a, double b, double c){
		
		if((a * a) + (b * b) == (c * c) || (a * a) + (c * c) == (b * b) || (b * b) + (c * c) == (a * a)){
			return true;			
		}
		return false;
		
	}
}
