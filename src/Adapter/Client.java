package Adapter;

import Adapter.Figuras.Adapter;
import Adapter.Figuras.Cube;
import Adapter.Figuras.Cylinder;
import Adapter.Figuras.Hole;

public class Client {

	public static void main(String[] args) {
		
		Hole hole = new Hole(5);
		Cylinder cylinder1 = new Cylinder(5, "Cilindro_1");
		Cylinder cylinder2 = new Cylinder(6, "Cilindro_2");

		if(hole.fits(cylinder1) == true) {
			System.out.println("El " + cylinder1.getName()  + " cabe en el agujero");
		} else {
			System.out.println("El " + cylinder1.getName()  + " no cabe en el agujero");
		}
		
		if(hole.fits(cylinder2) == true) {
			System.out.println("El " + cylinder2.getName()  + " cabe en el agujero");
		} else {
			System.out.println("El " + cylinder2.getName()  + " no cabe en el agujero");
		}
		
		Cube smallCube = new Cube(5, "cubo pequeño");
		Cube bigCube = new Cube(6, "cubo grande");

	//	hole.fits(smallCube); *Esto no compila al ser tipos incompatibles, por ello debemos usar el adaptador*

		
	
		
		if(hole.fits(cylinder1) == true) {
			System.out.println("El " + cylinder1.getName()  + " cabe en el agujero");
		} else {
			System.out.println("El " + cylinder1.getName()  + " no cabe en el agujero");
		}
		
		if(hole.fits(cylinder2) == true) {
			System.out.print("El " + cylinder2.getName()  + " cabe en el agujero");
		} else {
			System.out.print("El " + cylinder2.getName()  + " no cabe en el agujero");
		}
		
	//	small_sqpeg_adapter = new SquarePegAdapter(small_sqpeg)
	//	large_sqpeg_adapter = new SquarePegAdapter(large_sqpeg)
	//	hole.fits(small_sqpeg_adapter) // verdadero
	//	hole.fits(large_sqpeg_adapter) // falso
	
	}

}
