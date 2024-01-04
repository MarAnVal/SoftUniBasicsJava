package exam;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        //1. Броят на хората в групата – цяло число в интервала [0 … 50]
        //2. Броят на нощувките – цяло число в интервала [0 … 2000]
        //3. Броят на картите за транспорт – цяло число в интервала [0… 2000]
        //4. Броят на билетите за музеи – цяло число в интервала [0 … 2000]
        Scanner input = new Scanner(System.in);
        int pplNum = Integer.parseInt(input.nextLine());
        int nights = Integer.parseInt(input.nextLine());
        int transportCardsNum = Integer.parseInt(input.nextLine());
        int museumTicketsNum = Integer.parseInt(input.nextLine());
        //Нощувка - 20 лв.
        //Карта за транспорт - 1.60 лв.
        //Билет за музей - 6 лв.
        //Към крайната сума се начислява допълнително 25% за непредвидени разходи.
        double pricePerPerson = nights * 20 + transportCardsNum * 1.6 + museumTicketsNum * 6;
        double total = pricePerPerson * pplNum * 1.25;
        //парите, които групата трябва да плати, форматирани до втората цифра след десетичния знак
        System.out.printf("%.2f", total);
    }
}
