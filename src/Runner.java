import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws Exception{

		Triangle figure = new Triangle(7,10,13);
		Shape<Triangle> triangle = new Shape<Triangle>(figure);

		double area = triangle.getArea(figure.getBase(), figure.getHeight())/2;
		
		// The format "%.2f%n" is to print only two decimals. 
		System.out.printf("%.2f%n",area);




	}
}
