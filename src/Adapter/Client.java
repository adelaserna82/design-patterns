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
		
		Cube smallCube = new Cube(4, "cubo peque�o");
		Cube bigCube = new Cube(5, "cubo grande");

	//	hole.fits(smallCube); *Esto no compila al ser tipos incompatibles, por ello debemos usar el adaptador*

		
		Adapter smallCubeAdapted = new Adapter(smallCube);
		Adapter bigCubeAdapted = new Adapter(bigCube);
		
		if(hole.fits(smallCubeAdapted) == true) {
			System.out.println("El " + smallCubeAdapted.getName()  + " cabe en el agujero");
		} else {
			System.out.println("El " + smallCubeAdapted.getName()  + " no cabe en el agujero");
		}
		
		if(hole.fits(bigCubeAdapted) == true) {
			System.out.println("El " + bigCubeAdapted.getName()  + " cabe en el agujero");
		} else {
			System.out.println("El " + bigCubeAdapted.getName()  + " no cabe en el agujero");
		}	

	}
}
