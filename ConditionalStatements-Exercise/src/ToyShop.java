import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {

        // От спечелените пари Петя трябва да даде 10% за наема на магазина.
        // Да се пресметне дали парите ще ѝ стигнат да отиде на екскурзия.
        //1. Цена на екскурзията - реално число в интервала [1.00 … 10000.00]
        //2. Брой пъзели - цяло число в интервала [0… 1000] Пъзел - 2.60 лв.
        //3. Брой говорещи кукли - цяло число в интервала [0 … 1000] Говореща кукла - 3 лв.
        //4. Брой плюшени мечета - цяло число в интервала [0 … 1000] Плюшено мече - 4.10 лв.
        //5. Брой миньони - цяло число в интервала [0 … 1000] Миньон - 8.20 лв
        //6. Брой камиончета - цяло число в интервала [0 … 1000] Камионче - 2 лв.
        //Ако поръчаните играчки са 50 или повече магазинът прави отстъпка 25% от общата цена.
        //· Ако парите са достатъчни се отпечатва: "Yes! {оставащите пари} lv left."
        //· Ако парите НЕ са достатъчни се отпечатва: "Not enough money! {недостигащите пари} lv needed."

        Scanner input = new Scanner(System.in);

        Double ex = Double.parseDouble(input.nextLine());
        int puzzle = Integer.parseInt(input.nextLine());
        int doly = Integer.parseInt(input.nextLine());
        int teddy = Integer.parseInt(input.nextLine());
        int minion = Integer.parseInt(input.nextLine());
        int trunk = Integer.parseInt(input.nextLine());

        double total = puzzle * 2.6 + doly * 3.0 + teddy * 4.1 + minion * 8.2 + trunk * 2.0;
        if ((puzzle + doly + teddy + minion + trunk >= 50)){
            total = total * 0.75;
        }
        total = total * 0.9 - ex;

        if (total >= 0) {
            System.out.printf("Yes! %.2f lv left.", total);
        } else {
            total = total * (-1);
            System.out.printf("Not enough money! %.2f lv needed.", total);
        }



    }
}
