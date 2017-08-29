
public class Shape<T>{
	public int b;
	public int h;
	
	public int sides;
	
	private T shape;
	
	public void set(T t){
		this.shape = t;
	}
	
	public double area(){
		return b*h;
	}
	
	public double perimeter(){
		return 0;
	}
	
	public void scale(T shape){
		
	}
}
