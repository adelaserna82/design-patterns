package Builder.Class;

import Builder.Interfaces.ICarComponentsBuilder;

public class CarManualBuilder implements ICarComponentsBuilder {
    private Manual manual;

    public CarManualBuilder() {
        manual = new Manual();
    }

    public void reset() {
        manual = new Manual();
    }

    @Override
    public void setSeats(String seats) {
        manual.setSeats(seats);
    }

    @Override
    public void setEngine(String engine) {
        manual.setEngine(engine);
    }

    @Override
    public void setTripComputer(String tripComputer) {
        manual.setTripComputer(tripComputer);
    }

    @Override
    public void setGPS(String gps) {
        manual.setGps(gps);
    }


    public Manual getManual() {
        return manual;
    }
}
