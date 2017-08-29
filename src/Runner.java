
public class Runner {

	public static void main(String[] args) throws Exception{
		Triangle figure = new Triangle(7, 10, 15);
		Shape<Triangle> triangle = new Shape(figure);
		System.out.println(triangle.getArea(3, figure.getBase(), figure.getHeight()));
		System.out.println(triangle.getPerimeter(7, 10, 15, 0));
		
	}
}
