import java.util.Scanner;

public class TriangleArea {
    public TriangleArea() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());
        double total = a * h / 2.0;
        System.out.printf("%.2f", total);
    }
}
