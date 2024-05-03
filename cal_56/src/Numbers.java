public class Numbers {
    private Main main;
    private Chain chain;

    public Numbers(Main main) {
        this.main = main;
    }

    public void setChain(Chain chain) {
        this.chain = chain;
    }

    public void calculate() {
        chain.calculate(main);
    }
}
