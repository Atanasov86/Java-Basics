package PointsInsideTheHouse;

import java.util.Scanner;

public class PointsInsideTheHouse {
    public static final Point trianglePointA = new Point(12.5, 8.5);
    public static final Point trianglePointB = new Point(17.5, 3.5);
    public static final Point trianglePointC = new Point(22.5, 8.5);

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        Point inputPoint = new Point(x, y);
        String message = checkPointsIsInsideInTheHouse(inputPoint);
        System.out.println(message);
    }

    public static double sign(Point firstPoint, Point secondPoint, Point thirdPoint) {
        double sign = (firstPoint.getX() - thirdPoint.getX()) * (secondPoint.getY() - thirdPoint.getY()) -
                (secondPoint.getX() - thirdPoint.getX()) * (firstPoint.getY() - thirdPoint.getY());
        return sign;
    }

    public static boolean checkPointIsInTriangle(
            Point inputPoint,
            Point trianglePointA,
            Point trianglePointB,
            Point trianglePointC) {
        boolean b1, b2, b3;

        b1 = sign(inputPoint, trianglePointA, trianglePointB) < 0.0f;
        b2 = sign(inputPoint, trianglePointB, trianglePointC) < 0.0f;
        b3 = sign(inputPoint, trianglePointC, trianglePointA) < 0.0f;

        return ((b1 == b2) && (b2 == b3));
    }

    public static boolean checkIsValidYRectangle(Point inputPoint) {
        boolean isValidY = (inputPoint.getX() > 17.5 && inputPoint.getX() < 20) ?
                false :
                (inputPoint.getY() >= 8.5 && inputPoint.getY() <= 13.5);
        return isValidY;
    }

    public static boolean checkIsValidXRectangle(Point inputPoint) {
        boolean isValidX =
                (inputPoint.getY() >= 8.5 && inputPoint.getY() <= 13.5) ?
                        (inputPoint.getX() >= 12.5 && inputPoint.getX() <= 17.5)
                                || (inputPoint.getX() >= 20 && inputPoint.getX() <= 22.5) : false;
        return isValidX;
    }

    public static String checkPointsIsInsideInTheHouse(Point point) {
        boolean isValidX = checkIsValidXRectangle(point);
        boolean isValidY = checkIsValidYRectangle(point);
        boolean isInTheHouse = checkPointIsInTriangle(point, trianglePointA, trianglePointB, trianglePointC);
        if (isValidX && isValidY || isInTheHouse) {
            return "Inside";
        }
        return "Outside";
    }
}
