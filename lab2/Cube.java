package lab2;

public class Cube extends Shape3D {
	private double side; // side
	public Cube() {
		
	}
	public Cube(double side) {
		this.side = side;
	}
	public double volume() {
		return side * side * side;
	}
	public double surfaceArea() {
		return (6 * side * side);
	}
	public String toString() {
		return super.toString() + " Side of Cube is equal to " + side;
	}

}
