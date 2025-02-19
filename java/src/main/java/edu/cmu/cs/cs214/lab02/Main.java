package edu.cmu.cs.cs214.lab02;

import edu.cmu.cs.cs214.lab02.shapes.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Tegsh Untsugt \n2. Toirog \n3. Kvadrat \n4. Garah");
            String shapeType = scanner.nextLine().toLowerCase();

            if (shapeType.equals("4")) {
                System.out.println("Programaas garlaa!");
                break;
            }

            Shape shape = null;

            switch (shapeType) {
                case "1":
                    System.out.print("Urt: ");
                    double height = getValidDouble(scanner);
                    System.out.print("Urgun: ");
                    double width = getValidDouble(scanner);
                    shape = new Rectangle(height, width);
                    break;

                case "2":
                    System.out.print("Radius: ");
                    double radius = getValidDouble(scanner);
                    shape = new Circle(radius);

                    break;

                case "3":
                    System.out.print("Urt: ");
                    double sideLen = getValidDouble(scanner);
                    shape = new Square(sideLen);
                    break;

                default:
                    System.out.println("Buruu utga oruulsan baina.");
                    continue;
            }

            Renderer renderer = new Renderer(shape);
            renderer.draw();
        }

        scanner.close();
    }

    private static double getValidDouble(Scanner scanner) {
        while (true) {
            if (scanner.hasNextDouble()) {
                double value = scanner.nextDouble();
                scanner.nextLine();
                if (value > 0) {
                    return value;
                } else {
                    System.out.println("Utga eyreg baih ystoi! Dahin oruul: ");
                }
            } else {
                System.out.println("Buruu utga oruulsan bn! Too oruul: ");
                scanner.nextLine();
            }
        }
    }
}
