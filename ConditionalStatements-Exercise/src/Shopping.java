import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //· Видеокарта – 250 лв./бр.
        //· Процесор – 35% от цената на закупените видеокарти/бр.
        //· Рам памет – 10% от цената на закупените видеокарти/бр.
        //1. Бюджетът на Петър - реално число в интервала [0.0…100000.0]
        //2. Броят видеокарти - цяло число в интервала [0…100]
        //3. Броят процесори - цяло число в интервала [0…100]
        //4. Броят рам памет - цяло число в интервала [0…100]
        //Ако бюджета е достатъчен:
        //"You have {остатъчен бюджет} leva left!"
        //· Ако сумата надхвърля бюджета:
        //"Not enough money! You need {нужна сума} leva more!"
        //Ако броя на видеокартите е по-голям от този на процесорите получава 15% отстъпка от крайната сметка

        double budget = Double.parseDouble(input.nextLine());
        int videoCards = Integer.parseInt(input.nextLine());
        int processors = Integer.parseInt(input.nextLine());
        int ram = Integer.parseInt(input.nextLine());

        double videoCardsPrice = videoCards*250;
        double processorsPrice = videoCardsPrice*0.35*processors;
        double ramPrice = videoCardsPrice*0.10*ram;

        double total = videoCardsPrice + processorsPrice + ramPrice;
        if (videoCards > processors){
            total = total*0.85;
        }
        if (total > budget){
            System.out.printf("Not enough money! You need %.2f leva more!", total-budget);
        } else {
            System.out.printf("You have %.2f leva left!", budget-total);
        }


    }
}
