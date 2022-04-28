package Builder;
/*
El uso del patrón Builder sólo tiene sentido cuando tus
productos son bastante complejos y requieren una
Configuración extensiva. Los dos siguientes productos están // relacionados, aunque no tienen una interfaz común.
*/
public class Car {
    private String name;
    private String engine;
    private String seats;
    private String tripComputer;
    private String gps;

    public Car() {
    }

    public String getName() {
        return name;
    }

    public String getEngine() {
        return engine;
    }

    public String getSeats() {
        return seats;
    }

    public String getTripComputer() {
        return tripComputer;
    }

    public String getGps() {
        return gps;
    }
}
