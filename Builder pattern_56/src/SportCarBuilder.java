public class SportCarBuilder extends CarBuilder {

        public void determineModel() {
        car.setModel("i8 sport");
        }

        public void determineEngine() {
            car.setEngine("V-12");
        }

        public void determineSeats() {
            car.setSeats(2);
        }

        public void determineWheels() {
            car.setWheels(4);
        }

}