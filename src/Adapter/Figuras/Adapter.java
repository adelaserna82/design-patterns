package Adapter.Figuras;

public class Adapter extends Cylinder {

	private static String name;
	private static int radius;
	private Cube figure;
	
	public Adapter (Cube c) {
		super(radius, name);
		figure = c;
	}

	public int getRadius() {
		return (int) Math.sqrt(((int) Math.pow(figure.getWidth(), 2) + Math.pow(figure.getWidth(), 2)));
	}
}
