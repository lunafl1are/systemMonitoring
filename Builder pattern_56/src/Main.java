public class Main {

    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        CarBuilder sportCarBuilder = new SportCarBuilder();
        CarBuilder familyCarBuilder = new FamilyCarBuilder();

        factory.setCarBuilder( sportCarBuilder );
        factory.constructCar();

        Car car = factory.getCar();
        System.out.println("Model & category: " + car.getModel() + "\n" +
                "Engine: " + car.getEngine()+"\n" +
                "Quantity of seats: " + car.getSeats()+ "\n" +
                "Quantity of wheels: " + car.getWheels()+ "\n");

        factory.setCarBuilder( familyCarBuilder );
        factory.constructCar();

        Car car1 = factory.getCar();
        System.out.println("Model & category: " + car1.getModel() + "\n" +
                "Engine: " + car1.getEngine()+"\n"  +
                "Quantity of seats: " + car1.getSeats()+ "\n" +
                "Quantity of wheels: " + car1.getWheels());

    }
}
