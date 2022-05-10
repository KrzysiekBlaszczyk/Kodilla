public class Calculator {
    public void addition(int A, int B) {
        System.out.println("Wynik dodawania: "+(A+B));
    }

    public void substraction(int A, int B) {
        System.out.println("Wynik odejmowania: "+(A-B));
    }

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        calculator.addition(4,2);
        calculator.substraction(6,2);

    }
}