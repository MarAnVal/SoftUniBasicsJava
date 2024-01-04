import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        //• Пилешко меню – 10.35 лв.
        //• Меню с риба – 12.40 лв.
        //• Вегетарианско меню – 8.15 лв.
        //Групата ще си поръча и десерт, чиято цена е равна на 20% от общата сметка (без доставката).
        //Цената на доставка е 2.50 лв и се начислява най-накрая.
        // Брой пилешки менюта – цяло число в интервала [0 … 99]
        // Брой менюта с риба – цяло число в интервала [0 … 99]
        // Брой вегетариански менюта – цяло число в интервала [0 … 99]
        Scanner input = new Scanner(System.in);

        int chiMenu = Integer.parseInt(input.nextLine());
        int fishMenu = Integer.parseInt(input.nextLine());
        int vegetarianMenu = Integer.parseInt(input.nextLine());

        double sumMenu = chiMenu * 10.35 + fishMenu * 12.40 + vegetarianMenu * 8.15;
        double total = 2.5 + 1.2 * sumMenu;

        System.out.println(total);

    }
}
