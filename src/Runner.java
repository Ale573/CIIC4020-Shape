import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws Exception{

		Triangle figure = new Triangle(3,4,5);
		Shape<Triangle> triangle = new Shape<Triangle>(figure);

		double area = triangle.getArea(figure.getBase(), figure.getHeight())/2;
		
		if(figure.getClass().equals(triangle.getShape())){
		}
		
		System.out.printf("%.2f%n", figure.getHeight());
		System.out.println(area);




	}
}
