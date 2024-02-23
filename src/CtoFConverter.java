import java.util.Scanner;

public class CtoFConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature in Celsius: ");
        if (scanner.hasNextDouble()) {
            double celsius = scanner.nextDouble();
            if (celsius >= -273.15) { //lowerst temp posible in celcius
                double fahrenheit = celsius * 9 / 5 + 32;
                System.out.println("Equivalent temperature in Fahrenheit: " + fahrenheit);
            }
            else {
                System.out.println("Error: Temperature below min for celcius");
            }
        }
        else {
            System.out.println("Error: not a num");
            scanner.next();
        }
    }
}
