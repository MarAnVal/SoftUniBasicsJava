import java.util.Scanner;

public class Bills {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първи ред – месеците за които се търси средният разход – цяло число в интервала [1...100]
        //За всеки месец – сметката за ток – реално число в интервала [1.00...1000.00]
        int n = Integer.parseInt(input.nextLine());
        double electricity = 0.0;
        double water = 0.0;
        double internet = 0.0;
        double other = 0.0;
        for (int i = 0; i < n; i++){
            double bill = Double.parseDouble(input.nextLine());
            //За ток – всеки месец е различен, ще се чете от конзолата
            //за вода – 20 лв.
            //за интернет – 15 лв.
            //за други – събират се тока, водата и интернета за месеца и към сумата се прибавят 20%.
            //За всеки разход трябва да се пресметне колко общо е платено за всички месеци.
            electricity = electricity + bill;
            water = water + 20.0;
            internet = internet + 15.0;
            other = other + (bill + 35.0) * 1.2;


        }
        //1ви ред: "Electricity: {ток за всички месеци} lv"
        System.out.printf("%nElectricity: %.2f lv", electricity);
        //2ри ред: "Water: {вода за всички месеци} lv"
        System.out.printf("%nWater: %.2f lv", water);
        //3ти ред: "Internet: {интернет за всички месеци} lv"
        System.out.printf("%nInternet: %.2f lv", internet);
        //4ти ред: "Other: {други за всички месеци} lv"
        System.out.printf("%nOther: %.2f lv", other);
        //5ти ред: "Average: {средно всички разходи за месец} lv"
        System.out.printf("%nAverage: %.2f lv", (electricity + water + internet + other)/n);
        //Всички числа трябва да са форматирана до вторият знак след запетаята.
    }
}