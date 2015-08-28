import java.util.Scanner;

public class SumTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first number: ");
        int firstNumber = scanner.nextInt();
        System.out.print("Please enter second number: ");
        int secondNumber = scanner.nextInt();
        System.out.print("Result is: ");
        int result = firstNumber + secondNumber;
        System.out.println(result);
    }
}
