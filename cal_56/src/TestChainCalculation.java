import java.util.Scanner;

public class TestChainCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter two numbers: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("Enter the calculation (+, -, *, /): ");
        String req_calculation = sc.next();

        Main main = new Main(a, b, req_calculation);
        Numbers numbers = new Numbers(main);

        Chain chainAdd = new Addition();
        Chain chainSub = new Subtraction();
        Chain chainMul = new Multiplication();
        Chain chainDiv = new Division();

        chainAdd.setNextChain(chainSub);
        chainSub.setNextChain(chainMul);
        chainMul.setNextChain(chainDiv);

        numbers.setChain(chainAdd);
        numbers.calculate();
    }
}
