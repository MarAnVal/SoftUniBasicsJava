import java.util.Scanner;

public class SkiTrip {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първи ред - дни за престой - цяло число в интервала [0...365]
        //Втори ред - вид помещение - "room for one person", "apartment" или "president apartment"
        //Трети ред - оценка - "positive" или "negative
        int days = Integer.parseInt(input.nextLine());
        String room = input.nextLine();
        String referal = input.nextLine();
        double total = 0.0;

        switch (room){
            case "room for one person":
                //"room for one person" – 18.00 лв за нощувка
                //room for one person не ползва намаление
                //оценка "positive" добавя 25% към крайната цена
                //оценка "negative" добавя 10% отсъпка
                total = 18;
                if (referal.equals("positive")){
                    total = total * 1.25 * (days -1);
                } else if (referal.equals("negative")){
                    total = total * 0.9 * (days - 1);
                }
                break;
            case "apartment":
                //вид помещение        по-малко от 10 дни     между 10 и 15 дни      повече от 15 дни
                //apartment            30% от крайната цена   35% от крайната цена   50% от крайната цена
                //"apartment" – 25.00 лв за нощувка
                //оценка "positive" добавя 25% към крайната цена
                //оценка "negative" добавя 10% отсъпка
                total = 25.0;
                if (days > 15){
                    total = total * 0.5 * (days - 1);
                } else if (days >= 10){
                    total = total * 0.65 * (days - 1);
                } else total = total * 0.7 * (days - 1);
                if (referal.equals("positive")){
                    total = total * 1.25;
                } else if (referal.equals("negative")){
                    total = total * 0.9;
                }
                break;
            case "president apartment":
                //вид помещение        по-малко от 10 дни     между 10 и 15 дни      повече от 15 дни
                //president apartment  10% от крайната цена   15% от крайната цена   20% от крайната цена
                //"president apartment" – 35.00 лв за нощувка
                //оценка "positive" добавя 25% към крайната цена
                //оценка "negative" добавя 10% отсъпка
                total = 35.0;
                if (days > 15){
                    total = total * 0.8 * (days - 1);
                } else if (days >= 10){
                    total = total * 0.85 * (days - 1);
                } else total = total * 0.9 * (days - 1);
                if (referal.equals("positive")){
                    total = total * 1.25;
                } else if (referal.equals("negative")){
                    total = total * 0.9;
                }
                break;
        }
        //Цената за престоят му в хотела, форматирана до втория знак след десетичната запетая.
        System.out.printf("%.02f", total);

    }
}
