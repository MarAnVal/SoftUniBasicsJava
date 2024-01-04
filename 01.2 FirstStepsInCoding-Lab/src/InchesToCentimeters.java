import java.util.Scanner;

public class InchesToCentimeters {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double inchs = Double.parseDouble(input.nextLine());

        double centimeters = inchs * 2.54;
        System.out.println(centimeters);

    }
}
