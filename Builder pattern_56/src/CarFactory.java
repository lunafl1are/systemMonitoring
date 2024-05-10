class CarFactory {
    private CarBuilder carBuilder;

    public void setCarBuilder(CarBuilder cb) { carBuilder = cb; }

    public Car getCar() { return carBuilder.getCar(); }

    public void constructCar() {
        carBuilder.createNewCar();
        carBuilder.determineModel();
        carBuilder.determineEngine();
        carBuilder.determineSeats();
        carBuilder.determineWheels();
    }
}
