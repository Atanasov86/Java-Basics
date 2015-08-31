package TriangleArea;

import java.util.Scanner;

public class TriangleArea {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Point firstPoint = new Point(scanner.nextInt(), scanner.nextInt());
        Point secondPoint = new Point(scanner.nextInt(), scanner.nextInt());
        Point thirdPoint = new Point(scanner.nextInt(), scanner.nextInt());
        int area = firstPoint.getX() * (secondPoint.getY() - thirdPoint.getY())
                + secondPoint.getX() * (thirdPoint.getY() - firstPoint.getY())
                + thirdPoint.getX() * (firstPoint.getY() - secondPoint.getY());
        area = Math.abs(area);
        area /= 2;
        System.out.println(area);
    }
}
