import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int number1 = scanner.nextInt();
        System.out.println("Enter Second number: ");
        int number2 = scanner.nextInt();

        try {
            int result = number1 / number2;
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("it is always executed");
        }

        System.out.println(("Enter 5 elements for an array"));
        int[] array = new int[5];
        for (int i = 0; i < 5; i++) {
            array[i] = scanner.nextInt();
        }
        try {
            while (true) {
                System.out.println("Enter the index: ");
                int index = scanner.nextInt();
                System.out.println(array[index]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("it is always executed");
        }

        scanner.close();
    }
}