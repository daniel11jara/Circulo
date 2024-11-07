import java.text.DecimalFormat;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
		
		DecimalFormat format = new DecimalFormat("#.##");
		
		Circle circle = new Circle();
		
		System.out.println("Digite o raio do círculo: ");
		double inputRaius = scanner.nextDouble();
		
		circle.setRadius(inputRaius);
		
		if (circle.getRadius() > 0) {
			double area  = circle.calculateArea();
			double circumference = circle.calculateCircunferenca();
			
			System.out.println("Área do circulo: " + format.format(area));
			System.out.println("Circunference: "  + format.format(circumference));
		}
		
		scanner.close();

	}

}
