import java.util.Scanner;

public class FormattingNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        String aToHex = Integer.toHexString(a);
        int aToBinary = Integer.parseInt(Integer.toBinaryString(a));
        System.out.printf("|%1$-10s|%2$010d|%3$10.2f|%4$-10.3f|", aToHex, aToBinary, b, c);
    }
}
