
public class Triangle {

	private double a;
	private double b;
	private double c;

	public Triangle(double a, double b, double c) throws Exception{
			this.a = a;
			this.b = b;
			this.c = c;
	}

	public double getBase(){
		return b;
	}

	public double getHeight(){ 
		
		if(isRectangle()){
			return a;
		}
		
		else {
			double number = ((a*a)+(b*b)-(c*c))/(2*b);
			double height = Math.sqrt((a*a) - (number * number));
			return height;
		}
	}

	public boolean isATriangle(){

		if((a + b > c ) && (a + c > b) && (b + c > a)){
			return true;			
		}
		return false;

	}
	
	public boolean isRectangle(){
		
		if(a*a + b*b == c*c || a*a + c*c == b*b || b*b + c*c == a*a){
			return true;
		}
		return false;
	}
}
