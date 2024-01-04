import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        //Пакет химикали - 5.80 лв.
        //• Пакет маркери - 7.20 лв.
        //• Препарат - 1.20 лв (за литър)
        // Брой пакети химикали - цяло число в интервала [0...100]
        // Брой пакети маркери - цяло число в интервала [0...100]
        // Литри препарат за почистване на дъска - цяло число в интервала [0…50]
        // Процент намаление - цяло число в интервала [0...100]

        Scanner input = new Scanner(System.in);

        int pen = Integer.parseInt(input.nextLine());
        int marker = Integer.parseInt(input.nextLine());
        int cleaner = Integer.parseInt(input.nextLine());
        int discount = Integer.parseInt(input.nextLine());

        double sum = pen * 5.8 + marker * 7.2 + cleaner * 1.2;
        double total = sum * (100-discount)/100;

        System.out.println(total);

    }
}
