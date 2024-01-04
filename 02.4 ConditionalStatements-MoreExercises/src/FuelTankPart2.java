import java.util.Scanner;

public class FuelTankPart2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Типа на горивото – текст с възможности: "Gas", "Gasoline" или "Diesel"
        //Количество гориво – реално число в интервала [1.00 … 50.00]
        //Притежание на клубна карта – текст с възможности: "Yes" или "No"
        //Бензин – 2.22 лева за един литър,
        //Дизел – 2.33 лева за един литър
        //Газ – 0.93 лева за литър
        //между 20 и 25 литра включително, той получава 8 процента отстъпка от крайната ценa
        //повече от 25 литра гориво, той получава 10 процента отстъпка от крайната цена.
        //карта за отстъпки: 18 ст. за литър бензин, 12 ст. за литър дизел и 8 ст. за литър газ.
        //"{крайната цена на горивото} lv."

        String fuel = input.nextLine();
        double liters = Double.parseDouble(input.nextLine());
        String card = input.nextLine();

        double total = 0;
        double price = 0;
        double discountLiter = 1;


        if (card.equals("No")){
            if (fuel.equals("Gas")){
                price = 0.93;
            } else if (fuel.equals("Gasoline")){
                price = 2.22;
            } else if (fuel.equals("Diesel")){
                price = 2.33;
            }
        } else  if (card.equals("Yes")){
            if (fuel.equals("Gas")){
                price = 0.93 - 0.08;
            } else if (fuel.equals("Gasoline")){
                price = 2.22 - 0.18;
            } else if (fuel.equals("Diesel")){
                price = 2.33 - 0.12;
            }
        }
        if (liters >25){
            discountLiter = 0.9;
        } else if (liters >= 20){
            discountLiter = 0.92;
        }

        total = price*liters*discountLiter;

        System.out.printf("%.2f lv.", total);


    }
}
