package Adapter.Figuras;

public class Adapter extends Cylinder {

	private Cube figure;
	
	public Adapter (int r, String n) {
		super(r, n);
		
	}

	public Cube cube = null;
	
	public booblean adapterCube(cube c) {
		width = w;
	}

	public int getRadius(cube c) {
		return c.getWidth();
	}
}
