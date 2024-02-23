import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of gallons of gas in the tank: ");
        if (scanner.hasNextDouble()) {
            double gallons = scanner.nextDouble();
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (scanner.hasNextDouble()) {
                double efficiency = scanner.nextDouble();
                System.out.print("Enter the price of gas per gallon: ");
                if (scanner.hasNextDouble()) {
                    double pricePerGallon = scanner.nextDouble();

                    double costPer100Miles = (100 / efficiency) * pricePerGallon;
                    double distance = gallons * efficiency;
                    System.out.println("Cost per 100 miles: $" + costPer100Miles);
                    System.out.println("Distance the car can go: " + distance + " miles");
                }
                else {
                    System.out.println("Error: ppg not a num");
                }
            }
            else {
                System.out.println("Error: mpg not a num");
            }
        }
        else {
            System.out.println("Error: gallons not a num");
        }
    }
}
