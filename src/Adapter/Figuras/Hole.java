package Adapter.Figuras;

public class Hole {
	
	private int radius;
	
	public Hole(int r){
		radius = r;
	}
	
	public int getRadius() {
		return radius;
	}

	public boolean fits(Cylinder c) {
		if (c.getRadius() <= radius) {
			return true;
		} else {
			return false;
		}
	}
}
