//we define the Factory class to create various types of shapes.
/*
 * To keep the example simple, I have not received parameters for the shape sides in the 
 * ShapeFactory method. So, the factory is creating the different Shape object with the fixed side values.
 */
public class ShapeFactory {

	public static Shape createShape(String shapeType) {
		Shape shape = null;
		if ("Circle".equalsIgnoreCase(shapeType)) {
			shape = new Circle();
		} else if ("Rectangle".equalsIgnoreCase(shapeType)) {
			shape = new Rectangle();
		} else if ("Triangle".equalsIgnoreCase(shapeType)) {
			shape = new Triangle();
		} else {
			shape = new NullShape();
		}
		return shape;
	}
}
