import java.util.Scanner;

public class TruckDriver {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първи ред – Сезон – текст "Spring", "Summer", "Autumn" или "Winter"
        //Втори ред –  Километри на месец – реално число в интервала [10.00...20000.00]
        String season = input.nextLine();
        double kmPerMonth = Double.parseDouble(input.nextLine());
        //Един сезон е 4 месеца.
        double total = 4.0 * kmPerMonth;
        switch (season){
            case "Spring":
            case "Autumn":
                //                              Пролет/Есен
                //км на месец <= 5000           0.75 лв./км
                //5000 < км на месец <= 10000   0.95 лв./км1.
                //10000 < км на месец <= 20000  1.45 лв./км – за който и да е сезон
                if (kmPerMonth <= 5000){
                    total = total * 0.75;
                } else if (kmPerMonth < 10000){
                    total = total * 0.95;
                }else {
                    total = total * 1.45;
                }
                break;
            case "Summer":
                //                              Лято
                //км на месец <= 5000           0.90 лв./км
                //5000 < км на месец <= 10000   1.10 лв./км
                //10000 < км на месец <= 20000  1.45 лв./км – за който и да е сезон
                if (kmPerMonth <= 5000){
                    total = total * 0.9;
                } else if (kmPerMonth < 10000){
                    total = total * 1.1;
                }else {
                    total = total * 1.45;
                }
                break;
            case "Winter":
                //                              Зима
                //км на месец <= 5000           1.05 лв./км
                //5000 < км на месец <= 10000   1.25 лв./км
                //10000 < км на месец <= 20000  1.45 лв./км – за който и да е сезон
                if (kmPerMonth <= 5000){
                    total = total * 1.05;
                } else if (kmPerMonth < 10000){
                    total = total * 1.25;
                }else {
                    total = total * 1.45;
                }
                break;
        }
        //След като са извадени 10% за данъци се отпечатват останалите пари.
        total = total *0.9;
        //"{Заплатата на шофьора след данъците}", форматирана до втория знак след десетичната запетая.
        System.out.printf("%.2f", total);
    }
}
