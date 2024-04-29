public class ConcreteUserA extends User {
    public ConcreteUserA(Mediator mediator) {
        super(mediator);
    }
    public void send(String message) {
        mediator.send(message, this);
    }
    public void receive(String message) {
        System.out.println("User A received: " + message);
    }
}