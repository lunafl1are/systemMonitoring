public class Subtraction implements Chain {
    private Chain nextInChain;

    @Override
    public void setNextChain(Chain nextChain) {
        this.nextInChain = nextChain;
    }

    @Override
    public void calculate(Main request) {
        if (request.getReq_calculation().equals("-")) {
            int result = request.getA() - request.getB();
            System.out.println(request.getA() + " - " + request.getB() + " = " + result);
        } else if (nextInChain != null) {
            nextInChain.calculate(request);
        } else {
            System.out.println("Invalid calculation request");
        }
    }
}
