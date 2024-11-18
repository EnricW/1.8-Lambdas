package level1.exercise5;

public class Main {
    public static void main(String[] args) {
        PiInterface piInterface = () ->  3.1415;
        System.out.println("Value of Pi: " + piInterface.getPiValue());
    }
}