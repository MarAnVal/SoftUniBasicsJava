import java.util.Scanner;

public class NewHouse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //              цвете   Роза   Далия   Лале   Нарцис   Гладиола
        //Цена на брой в лева     5    3.80    2.80     3       2.50

        //Брой цветя - цяло число в интервала [10…1000]
        //Бюджет - цяло число в интервала [50…2500]
        //Ако бюджета им е достатъчен - "Hey, you have a great garden with {броя цвета} {вид цветя} and {останалата сума} leva left."
        //Ако бюджета им е НЕ достатъчен - "Not enough money, you need {нужната сума} leva more."
        //Сумата да бъде форматирана до втория знак след десетичната запетая.

        String type = input.nextLine();
        int num = Integer.parseInt(input.nextLine());
        int budget = Integer.parseInt(input.nextLine());
        double total = 0;
        double price = 0;

        switch (type){
            //Вид цветя - текст с възможности - "Roses", "Dahlias", "Tulips", "Narcissus", "Gladiolus"
            case "Roses":
                //повече от 80 Рози - 10% отстъпка от крайната цена
                //5lv
                if (num > 80){
                    price = 5 * 0.9;
                } else price = 5; break;
            case "Dahlias":
                //повече от 90 Далии - 15% отстъпка от крайната цена
                //3.80lv
                if (num > 90){
                    price = 3.8 * 0.85;
                } else price = 3.8; break;
            case "Tulips":
                //повече от 80 Лалета - 15% отстъпка от крайната цена
                //2.80lv
                if (num > 80){
                    price = 2.8 * 0.85;
                } else price = 2.8; break;
            case "Narcissus":
                //по-малко от 120 Нарциса - цената се оскъпява с 15%
                //3lv
                if (num < 120){
                    price = 3 * 1.15;
                } else price = 3; break;
            case "Gladiolus":
                //по-малко от 80 Гладиоли - цената се оскъпява с 20%
                //2.50lv
                if (num < 80){
                    price = 2.5 * 1.2;
                } else price = 2.5; break;
        }
        total = price * num;
        if (total <= budget){
            System.out.printf("Hey, you have a great garden with %d %s and %.2f leva left.", num, type, budget - total);
        } else
            System.out.printf("Not enough money, you need %.2f leva more.", total - budget);

    }
}
