import java.util.Scanner;

public class WeatherForecastPart2 {
    public WeatherForecastPart2() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double c = Double.parseDouble(input.nextLine());
        if (c < 5.0) {
            System.out.println("unknown");
        } else if (c < 12.0) {
            System.out.println("Cold");
        } else if (c < 15.0) {
            System.out.println("Cool");
        } else if (c < 20.1) {
            System.out.println("Mild");
        } else if (c < 26.0) {
            System.out.println("Warm");
        } else if (c <= 35.0) {
            System.out.println("Hot");
        } else {
            System.out.println("unknown");
        }

    }
}
