public class FamilyCarBuilder extends CarBuilder {

    public void determineModel() { car.setModel   ("X7 family"); }

    public void determineEngine() { car.setEngine ("V-8"); }

    public void determineSeats() {
        car.setSeats(7);
    }

    public void determineWheels() {
        car.setWheels(4);
    }
}