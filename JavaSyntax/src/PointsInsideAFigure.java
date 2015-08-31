import java.util.Scanner;

public class PointsInsideAFigure {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        String message = checkPointsIsInsideInFigure(x, y);
        System.out.println(message);
    }

    public static boolean checkIsValidY(double x, double y) {
        boolean isValidY = (x > 17.5 && x < 20) ? (y >= 6 && y <= 8.5) : (y >= 6 && y <= 13.5);
        return isValidY;
    }

    public static boolean checkIsValidX(double x, double y){
        boolean isValidX = (y >= 6 && y <= 8.5) ?
                (x >= 12.5 && x <= 22.5) :
                (x >= 12.5 && x <= 17.5) || (x >= 20 && x <= 22.5);
        return isValidX;
    }

    public static String checkPointsIsInsideInFigure(double x, double y) {
        boolean isValidX = checkIsValidX(x, y);
        boolean isValidY = checkIsValidY(x, y);
        if (isValidX && isValidY) {
            return "Inside";
        }
        return "Outside";
    }
}
