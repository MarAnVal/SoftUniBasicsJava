import java.util.Scanner;

public class CircleAreaAndPerimeter {
    public CircleAreaAndPerimeter() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double r = Double.parseDouble(input.nextLine());
        double area = Math.PI * r * r;
        double perimeter = 6.283185307179586 * r;
        System.out.printf("%.2f%n%.2f", area, perimeter);
    }
}
