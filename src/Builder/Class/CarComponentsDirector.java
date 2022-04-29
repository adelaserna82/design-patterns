package Builder.Class;

import Builder.Interfaces.ICarComponentsBuilder;

public class CarComponentsDirector {
    private ICarComponentsBuilder builder;

    public CarComponentsDirector() {
    }

    public void setBuilder(ICarComponentsBuilder builder) {
        this.builder = builder;
    }


    public void constructSportCar(ICarComponentsBuilder builder) {
        builder.reset();
        builder.setSeats("Leather");
        builder.setEngine("V8");
        builder.setTripComputer("Yes");
        builder.setGPS("Yes");
    }

    public void constructSUV(ICarComponentsBuilder builder) {
        builder.reset();
        builder.setSeats("NoLeather");
        builder.setEngine("V5");
        builder.setTripComputer("No");
        builder.setGPS("Yes");
    }
}
