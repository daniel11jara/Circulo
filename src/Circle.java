
public class Circle {
	
	private double radius;

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		
		if (radius > 0) {
			this.radius = radius;
		}else {
			System.out.println("O raio deve ser maior que zero");
		}
		
	}
	
	public double calculateArea() {
		return Math.PI * radius * radius;
	}
	
	public double calculateCircunferenca() {
		return 2 * Math.PI * radius;
	}
	
	

}
