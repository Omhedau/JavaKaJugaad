import java.util.Scanner;

public class SineExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an angle in degrees: ");
        double degrees = scanner.nextDouble();

        // Convert degrees to radians
        double radians = Math.toRadians(degrees);

        // Calculate sine
        double sineValue = Math.sin(radians);

        System.out.println("Sine of " + degrees + " degrees is: " + sineValue);

        scanner.close();
    }
}
