abstract class CarBuilder {
    protected Car car;

    public Car getCar() { return car; }

    public void createNewCar() { car = new Car(); }

    public abstract void determineEngine();
    public abstract void determineSeats();
    public abstract void determineWheels();
    public abstract void determineModel();
}