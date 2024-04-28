class Main {
    public static void main(String[] args) {
        ConcreteMediator mediator = new ConcreteMediator();
        ConcreteUserA userA = new ConcreteUserA(mediator);
        ConcreteUserB userB = new ConcreteUserB(mediator);
        mediator.setUserA(userA);
        mediator.setUserB(userB);
        userA.send("Hey, it's A.");
        userB.send("Hello, it's B.");
    }
}