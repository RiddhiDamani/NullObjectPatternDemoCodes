
public class Circle implements Shape {
	
	private final  double radius;
	
	public Circle() {
		this(1.0d);
	}
	
	public Circle(double radius) {
		// TODO Auto-generated constructor stub
		this.radius = radius;
	}

	@Override
	public double area() {
		// TODO Auto-generated method stub
		return Math.PI * Math.pow(radius,2);
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2 * Math.PI * radius;
	}

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("Drawing Circle with area: " + area() + " and perimeter: " + perimeter());
		
	}

	@Override
	public boolean isNull() {
		// TODO Auto-generated method stub
		return false;
	}
	
}