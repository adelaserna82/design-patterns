package Builder;

import Builder.Class.*;

public class Client {


    public static void main(String[] args) {
        // Creamos un coche y manual sin director
        makeCar();
        // Creamos un coche y manual con director
        makeCarWithDirector();

        System.out.println("\n\nAcabado todo");
    }

    public static  void makeCarWithDirector(){
        // Se instancia al director para que se encargue de construir un coche y un manual de coche
        // según la plantilla de tipo de coche que se quiera construir
        CarComponentsDirector director = new CarComponentsDirector();

        // Se crea el coche
        CarBuilder carBuilder = new CarBuilder();
        director.constructSportCar(carBuilder);
        Car car = carBuilder.getCar();

        // Se crea el manual
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        director.constructSUV(carManualBuilder);
        Manual manual = carManualBuilder.getManual();

    }

    public static void makeCar(){
        // Se crea el coche
        CarBuilder carBuilder = new CarBuilder();
        carBuilder.setSeats("Leather");
        carBuilder.setEngine("V8");
        carBuilder.setTripComputer("Yes");
        carBuilder.setGPS("Yes");
        Car car = carBuilder.getCar();

        // Se crea el manual
        CarManualBuilder carManualBuilder = new CarManualBuilder();
        carManualBuilder.setSeats("NoLeather");
        carManualBuilder.setEngine("V5");
        carManualBuilder.setTripComputer("No");
        carManualBuilder.setGPS("Yes");
        Manual manual = carManualBuilder.getManual();

    }
}
