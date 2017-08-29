
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
		
			int angle = (int)Math.atan(c/a);
			double height = angle * a;
			return height;
	}
	
	public boolean isATriangle(double a, double b, double c){
		
		if((a + b > c ) && (a + c > b) && (b + c > a)){
			return true;			
		}
		return false;
		
	}
}
