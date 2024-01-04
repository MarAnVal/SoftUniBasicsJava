import java.util.Scanner;

public class TrapeziodArea {
    public TrapeziodArea() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double b1 = Double.parseDouble(input.nextLine());
        double b2 = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());
        double total = (b1 + b2) * h / 2.0;
        System.out.printf("%.2f", total);
    }
}
