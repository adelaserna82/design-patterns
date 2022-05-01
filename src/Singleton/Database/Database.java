package Singleton.Database;

public class Database {

	private static Database instance;
	private String conexion;
	
	private static Database database(String c) {
		
		if (instance == null) {
			instance = new Database();
			instance.conexion = c;
		}
		
		return instance;
	}
	
	//Retornamos la instancia
	public static Database getInstance(String c) {
		database(c);
	}

	public String getConexion() {
		return conexion;
	}
	

}