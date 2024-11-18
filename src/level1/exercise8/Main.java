package level1.exercise8;

public class Main {
    public static void main(String[] args) {
        Reverser reverser = input -> new StringBuilder(input).reverse().toString();

        String string = "Lewandowski";
        String reversedString = reverser.reverse(string);

        System.out.println("String: " + string);
        System.out.println("Reversed string: " + reversedString);
    }
}