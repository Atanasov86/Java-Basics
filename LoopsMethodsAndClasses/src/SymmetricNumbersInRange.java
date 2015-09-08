import java.util.Scanner;

public class SymmetricNumbersInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        for (int i = start; i <= end; i++) {
            boolean isSymmetric = isSymmetricNumber(i);
            if (isSymmetric) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isSymmetricNumber(int number) {
        if (number > 0 & number < 10) {
            return true;
        }

        String numberAsString = Integer.toString(number);
        char firstDigitForCompare;
        char secondDigitForCompare;

        if (numberAsString.length() > 2) {
            firstDigitForCompare = numberAsString.charAt(0);
            secondDigitForCompare = numberAsString.charAt(2);
        } else {
            firstDigitForCompare = numberAsString.charAt(0);
            secondDigitForCompare = numberAsString.charAt(1);
        }


        if (firstDigitForCompare == secondDigitForCompare) {
            return true;
        }

        return false;
    }
}
