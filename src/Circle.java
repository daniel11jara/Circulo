
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
	
	

}
