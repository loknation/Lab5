import java.util.Scanner;

public class RectInfo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of the rectangle: ");
        if (scanner.hasNextDouble()) {
            double length = scanner.nextDouble();
            System.out.print("Enter the width of the rectangle: ");
            if (scanner.hasNextDouble()) {
                double width = scanner.nextDouble();
                double area = length * width;
                double perimeter = 2 * (length + width);
                double diagonal = Math.sqrt(Math.pow(length, 2) + Math.pow(width, 2));
                System.out.println("Area of the rectangle: " + area);
                System.out.println("Perimeter of the rectangle: " + perimeter);
                System.out.println("Length of the diagonal of the rectangle: " + diagonal);
            }
            else {
                System.out.println("Error: width not a num");
            }
        }
        else {
            System.out.println("Error: length not a num");
        }
    }
}
