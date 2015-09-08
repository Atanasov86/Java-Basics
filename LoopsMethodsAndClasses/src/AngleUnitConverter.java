import java.util.Scanner;

public class AngleUnitConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < n; i++) {
            String inputLine = scanner.nextLine();
            String[] tokens = inputLine.split(" ");
            double number = Double.parseDouble(tokens[0]);
            String measure = tokens[1];

            String result;
            if (measure.equals("rad")){
                number = Math.toDegrees(number);
                result = String.format("%.6f deg", number);
            } else {
                number = Math.toRadians(number);
                result = String.format("%.6f rad", number);
            }

            System.out.println(result);
        }
    }
}
