import java.util.Scanner;

public class FishingBoat {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Бюджет на групата – цяло число в интервала [1…8000]
        //Сезон – текст : "Spring", "Summer", "Autumn", "Winter"
        //Брой рибари – цяло число в интервала [4…18]

        int budget = Integer.parseInt(input.nextLine());
        String season = input.nextLine();
        ;
        int num = Integer.parseInt(input.nextLine());
        double total = 0.0;
        //Ако групата е до 6 човека включително – отстъпка от 10%.
        //Ако групата е от 7 до 11 човека включително – отстъпка от 15%.
        //Ако групата е от 12 нагоре – отстъпка от 25%.
        //Цената за наем на кораба през пролетта е 3000 лв.
        //Цената за наем на кораба през лятото и есента е 4200 лв.
        //Цената за наем на кораба през зимата е 2600 лв.
        //Рибарите ползват допълнително 5% отстъпка ако са четен брой освен ако не е есен - тогава нямат допълнителна отстъпка.
        switch (season) {
            case "Spring":
                total = 3000;
                if (num <= 6) {
                    total = total * 0.9;
                } else if (num <= 11) {
                    total = total * 0.85;
                } else {
                    total = total * 0.75;
                }
                if (num % 2 == 0) {
                    total = total * 0.95;
                }
                break;
            case "Summer":
                total = 4200;
                if (num <= 6) {
                    total = total * 0.9;
                } else if (num <= 11) {
                    total = total * 0.85;
                } else {
                    total = total * 0.75;
                }
                if (num % 2 == 0) {
                    total = total * 0.95;
                }
                break;
            case "Autumn":
                total = 4200;
                if (num <= 6) {
                    total = total * 0.9;
                } else if (num <= 11) {
                    total = total * 0.85;
                } else {
                    total = total * 0.75;
                }
                break;
            case "Winter":
                total = 2600;
                if (num <= 6) {
                    total = total * 0.9;
                } else if (num <= 11) {
                    total = total * 0.85;
                } else {
                    total = total * 0.75;
                }
                if (num % 2 == 0) {
                    total = total * 0.95;
                }
                break;
        }

            // Ако бюджетът е достатъчен: "Yes! You have {останалите пари} leva left."
            //Ако бюджетът НЕ Е достатъчен: "Not enough money! You need {сумата, която не достига} leva."
            //Сумите трябва да са форматирани с точност до два знака след десетичната запетая.
            if (total <= budget) {
                System.out.printf("Yes! You have %.2f leva left.", budget - total);
            } else
                System.out.printf("Not enough money! You need %.2f leva.", total - budget);

        }
    }

