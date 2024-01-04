import java.util.Scanner;

public class CelsiusToFahrenheit {
    public CelsiusToFahrenheit() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c = Double.parseDouble(input.nextLine());
        double f = c * 1.8 + 32.0;
        System.out.printf("%.2f", f);
    }
}
