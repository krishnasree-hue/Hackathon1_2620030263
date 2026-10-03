import java.util.Scanner;

public class WasteCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter waste collected at collection point 1: ");
        double point1 = scanner.nextDouble();

        System.out.print("Enter waste collected at collection point 2: ");
        double point2 = scanner.nextDouble();

        double totalWaste = calculateTotalWaste(point1, point2);
        System.out.println("The total waste collected is: " + totalWaste);

        scanner.close();
    }

    public static double calculateTotalWaste(double point1Waste, double point2Waste) {
        return point1Waste + point2Waste;
    }
}