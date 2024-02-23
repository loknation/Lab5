import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter measurement in meters: ");
        if (scanner.hasNextDouble()) {
            double meters = scanner.nextDouble();
            double miles = meters * 0.000621371;
            double feet = meters * 3.28084;
            double inches = meters * 39.3701;
            System.out.println("Measurement in miles: " + miles);
            System.out.println("Measurement in feet: " + feet);
            System.out.println("Measurement in inches: " + inches);
        }
        else {
            System.out.println("Error: not a num");
        }
    }
}
