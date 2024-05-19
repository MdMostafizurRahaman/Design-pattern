import java.util.Scanner;

public class AdapterPatternExample {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the base of the triangle:");
        double base = scanner.nextDouble();

        System.out.println("Enter the height of the triangle:");
        double height = scanner.nextDouble();

        TriangleAreaCalculator triangleAreaCalculator = new TriangleAreaCalculator(base, height);
        double area = triangleAreaCalculator.getArea();
        System.out.println("Area of Triangle: " + area);

        scanner.close();
    }
}
