package level2.exercise3;

public class Main {
    public static void main(String[] args) {

        Operation addition = (a, b) -> a + b;
        Operation subtraction = (a, b) -> a - b;
        Operation multiplication = (a, b) -> a * b;
        Operation division = (a, b) -> a / b;

        float num1 = 4f;
        float num2 = 2f;

        System.out.println(num1 + " + " + num2 + " = " + addition.operation(num1, num2));
        System.out.println(num1 + " - " + num2 + " = " + subtraction.operation(num1, num2));
        System.out.println(num1 + " * " + num2 + " = " + multiplication.operation(num1, num2));
        System.out.println(num1 + " / " + num2 + " = " + division.operation(num1, num2));
    }
}
