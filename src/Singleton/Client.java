package Singleton;

import Singleton.Database.Database;

public class Client {

	public static void main(String[] args) {
		
		//Aquí instanciamos a la base de datos peticionando una conexión SQL
		Database myConexion = Database.getInstance("SQL");
		System.out.println(myConexion.getConexion());
		
		//Aquí volvemos a instanciar a la base de datos peticionando ACCES.
		//El constructor detectará que ya esta instanciado y nos devolverá la primera conexión establecida.
		Database myConexion2 = Database.getInstance("ACCES");
		System.out.println(myConexion2.getConexion());
	}
}
