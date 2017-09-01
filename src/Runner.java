
public class Runner {

	public static void main(String[] args) throws Exception{
		Triangle figure = new Triangle(3,4,5);
		Shape<Triangle> triangle = new Shape<Triangle>(figure);
		
		double area = triangle.getArea(3, figure.getBase(), figure.getHeight());
		
		System.out.printf("%.2f%n", figure.getHeight());
		System.out.println(area);
		
		
	}
}
