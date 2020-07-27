/*
 * Now, the most important step is to create a null object class that extends 
 * the abstract class or interface and define the do nothing behavior.  
 * The do nothing behavior is like a default behavior in case data is not available.
 */
public class NullShape implements Shape{
	// no sides
    
	@Override
    public double area() {
    return 0.0d;
    }
    
	@Override
    public double perimeter() {
    return 0.0d;
    }
    
	@Override
    public void draw() {
    System.out.println("Null object can't be draw");
    }
    
	@Override
    public boolean isNull() {
    return true;
    }

}
