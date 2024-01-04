import java.util.Scanner;

public class HousePainting {
    public HousePainting() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = Double.parseDouble(input.nextLine());
        double y = Double.parseDouble(input.nextLine());
        double h = Double.parseDouble(input.nextLine());
        double totalHouseArea = (x + y) * x * 2.0 - 6.9;
        double totalRoofArea = 2.0 * x * y + x * h;
        double totalGreen = totalHouseArea / 3.4;
        double totalRed = totalRoofArea / 4.3;
        System.out.printf("%.2f%n%.2f", totalGreen, totalRed);
    }
}
