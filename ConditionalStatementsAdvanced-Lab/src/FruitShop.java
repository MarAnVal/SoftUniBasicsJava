import java.util.Scanner;

public class FruitShop {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Магазин за плодове през работните дни работи на следните цени:
        // плод banana apple orange grapefruit kiwi pineapple grapes
        // цена 2.50   1.20  0.85    1.45      2.70   5.50     3.85
        //Събота и неделя магазинът работи на по-високи цени:
        //плод banana apple orange grapefruit kiwi pineapple grapes
        //цена 2.70   1.25  0.90    1.60      3.00   5.60     4.20
        //
        //Напишете програма, която чете от конзолата плод (banana / apple / orange / grapefruit / kiwi / pineapple / grapes),
        // ден от седмицата (Monday / Tuesday / Wednesday / Thursday / Friday / Saturday / Sunday)
        // и количество (десетично число) , въведени от потребителя, и пресмята цената според цените от таблиците по-горе
        //При невалиден ден от седмицата или невалидно име на плод да се отпечата "error".

        String fruit = input.nextLine();;
        String day = input.nextLine();
        double amount = Double.parseDouble(input.nextLine());
        double total = 0;
        double price = 0;
        String flag = "";

        switch (day){
            case "Monday":
            case "Tuesday":
            case "Wednesday":
            case "Thursday":
            case "Friday":
                switch (fruit){
                    case "banana": price = 2.5;break;
                    case "apple": price = 1.20;break;
                    case "orange": price = 0.85;break;
                    case "grapefruit": price = 1.45;break;
                    case "kiwi": price = 2.7;break;
                    case "pineapple": price = 5.5;break;
                    case "grapes": price = 3.85;break;

                    default: flag = "error"; break;
                } break;
            case "Saturday":
            case "Sunday":
                switch (fruit){
                    case "banana": price = 2.7;break;
                    case "apple": price = 1.25;break;
                    case "orange": price = 0.9;break;
                    case "grapefruit": price = 1.6;break;
                    case "kiwi": price = 3;break;
                    case "pineapple": price = 5.6;break;
                    case "grapes": price = 4.2;break;

                    default: flag = "error"; break;
                }break;
            default: flag = "error"; break;
        }
        if (flag.equals("error")){
            System.out.println(flag);
        } else {
            total = price * amount;
            System.out.printf("%.2f", total);}




    }
}
