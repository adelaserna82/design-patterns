package Singleton;

import Singleton.Database.Database;

public class Client {

	public static void main(String[] args) {
		

		Database myConexion = Database.getInstance("SQL");
		
		System.out.println(myConexion.getConexion());

	}

}
