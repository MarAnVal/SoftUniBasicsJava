import java.util.Scanner;

public class MultiplyBy2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = Double.parseDouble(input.nextLine());
        while (a >= 0){
            System.out.printf("Result: %.2f%n", a * 2);
            a = Double.parseDouble(input.nextLine());
        }
        System.out.print("Negative number!");
    }
}
