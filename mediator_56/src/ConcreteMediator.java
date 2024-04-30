public class ConcreteMediator implements Mediator {
    private ConcreteUserA userA;
    private ConcreteUserB userB;
    public void setUserA(ConcreteUserA userA) {
        this.userA = userA;
    }
    public void setUserB(ConcreteUserB userB) {
        this.userB = userB;
    }
    public void send(String message,User user) {
        if (user == userA) {
            userB.receive(message);
        } else {
            userA.receive(message);
        }
    }
}