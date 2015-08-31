import java.util.Scanner;

public class RectangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter first side: ");
        int sideA = Integer.parseInt(scanner.next());
        System.out.print("Please enter second side: ");
        int sideB = Integer.parseInt(scanner.next());
        int area = sideA * sideB;
        System.out.printf("Area is: %d", area);
    }

}
