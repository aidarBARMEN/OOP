package lab2;

public class Sphere extends Shape3D {
	private double radius;
	public Sphere(){
		
	}
	public Sphere(double r) {
		this.radius = r;
		
		}
	public double volume() {
		return Math.PI * radius * radius * radius * 4/3;
		}
	
	public double surfaceArea() {
		return 4 * Math.PI * radius * radius;
	}
	
	
	public String toString() {
		return super.toString() + " Radius of Sphere is equal to " + radius;
	}

}
