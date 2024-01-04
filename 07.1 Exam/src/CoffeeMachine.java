import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        //Първи ред - напитка - текст с възможности"Espresso", "Cappuccino" или "Tea"
        //Втори ред - захар - текст  с възможности "Without", "Normal" или "Extra"
        //Трети ред - брой напитки - цяло число в интервала [1… 50]
        Scanner input = new Scanner(System.in);
        String drink = input.nextLine();
        String type = input.nextLine();
        int number = Integer.parseInt(input.nextLine());
        double total = 0;
        //При избрана напитка без захар има 35% отстъпка.
        switch (drink){
            case "Espresso":
                switch (type){
                    case "Without":
                        total = (number * 0.9)*0.65;
                        if (number > 5){
                            total *= 0.75;
                        }
                        break;
                    case "Normal":
                        total = number;
                        if (number > 5){
                            total *= 0.75;
                        }
                        break;
                    case "Extra":
                        total = number * 1.2;
                        if (number > 5){
                            total *= 0.75;
                        }
                        break;
                }
                break;
            case "Cappuccino":
                switch (type){
                    case "Without":
                        total = number * 0.65;
                        break;
                    case "Normal":
                        total = number * 1.2;
                        break;
                    case "Extra":
                        total = number * 1.6;
                        break;
                }
                break;
            case "Tea":
                switch (type){
                    case "Without":
                        total = (number * 0.5)*0.65;
                        break;
                    case "Normal":
                        total = number * 0.6;
                        break;
                    case "Extra":
                        total = number * 0.7;
                        break;
                }
                break;
        }

        //При избрана напитка "Espresso" и закупени поне 5 броя, има 25% отстъпка.
        if (total > 15){
            total *= 0.8;
        }
        //При сума надвишава 15 лева, 20% отстъпка от крайната цена,
        //Отстъпките се прилагат в реда на тяхното описване.
        System.out.printf("You bought %d cups of %s for %.2f lv.", number, drink, total);
        //"You bought {брой напитки} cups of {напитка} for {крайна цена} lv."
        //Цената да бъде форматирана до втората цифра след десетичния знак.
    }
}
