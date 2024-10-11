package lab2;

public class Shape3DTest {
	public static void main(String[] args) {
		Cylinder Cylin = new Cylinder(1,3);
		System.out.println(Cylin);
		// System.out.println(Cylin.surfaceArea()); оказывается в соло можно таквызвать
		
		Sphere Spher = new Sphere(5);
		System.out.println(Spher);
		
		Cube Cub = new Cube(2);
		System.out.println(Cub);
		
	}

}
