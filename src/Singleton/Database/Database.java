package Singleton.Database;

public class Database {

	private static Database instance;
	private String conexion;
	
	private Database (String c) {
		conexion = c;
	}
	
	//Retornamos la instancia
	public static Database getInstance(String c) {
		if (instance == null) {
			instance = new Database(c);
		}
		return instance;
	}

	public String getConexion() {
		return conexion;
	}
	

}