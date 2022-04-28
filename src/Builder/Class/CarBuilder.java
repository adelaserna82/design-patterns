package Builder.Class;

import Builder.Interfaces.ICarComponentsBuilder;

public class CarBuilder implements ICarComponentsBuilder {
    private Car car;

    public CarBuilder() {
        car = new Car();
    }

    public void reset() {
        car = new Car();
    }

    @Override
    public void setSeats(String seats) {
        car.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        car.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        car.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        car.setGps(gps);
    }


    public Car getCar() {
        return car;
    }
}
