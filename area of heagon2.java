import java.util.Scanner;

public class HexagonAreaCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of one side of the hexagon: ");
        double sideLength = scanner.nextDouble();

        double area = calculateHexagonArea(sideLength);
        System.out.println("The area of the hexagon is: " + area);

        scanner.close();
    }

    public static double calculateHexagonArea(double sideLength) {
        // Calculate the area using the formula
        double area = (3 * Math.sqrt(3) * Math.pow(sideLength, 2)) / 2;
        return area;
    }
}
