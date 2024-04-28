public class ConcreteUserB extends User {
    public ConcreteUserB(Mediator mediator) {
        super(mediator);
    }
    public void send(String message) {
        mediator.send(message, this);
    }
    public void receive(String message) {
        System.out.println("User B received: " + message);
    }
}