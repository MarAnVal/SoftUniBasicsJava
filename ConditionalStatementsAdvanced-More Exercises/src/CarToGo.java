import java.util.Scanner;

public class CarToGo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първи ред – Бюджет – реално число в интервала [10.00...10000.00]
        //Втори ред –  Сезон – текст "Summer" или "Winter"
        double budget = Double.parseDouble(input.nextLine());
        String season = input.nextLine();
        String type = "";
        String car = "";
        double total = 0.0;
        switch (season){
            case "Summer":
                //При бюджет <= от 100лв.:
                //Класът ще е - "Economy class"
                //Лято – Кабрио – 35% от бюджета
                //При бюджет > от 100лв. <= от 500лв.:
                //Класът ще е - "Compact class"
                //Лято – Кабрио – 45% от бюджета
                //При бюджет > от 500лв.:
                //Класът ще е – "Luxury class"
                //За всеки сезон колата ще е джип и цената ще е:
                //90% от бюджета
                //"Cabrio" и "Jeep"
                if (budget <= 100){
                    type= "Economy class"; car = "Cabrio";
                    total = budget * 0.35;
                }else if (budget <= 500){
                    type = "Compact class"; car = "Cabrio";
                    total = budget * 0.45;
                }else {
                    type = "Luxury class"; car = "Jeep";
                    total = budget * 0.9;
                }

                break;
            case "Winter":
                //При бюджет <= от 100лв.:
                //Класът ще е - "Economy class"
                //Зима – Джип – 65% от бюджета
                //При бюджет > от 100лв. <= от 500лв.:
                //Класът ще е - "Compact class"
                //Зима – Джип – 80% от бюджета
                //При бюджет > от 500лв.:
                //Класът ще е – "Luxury class"
                //За всеки сезон колата ще е джип и цената ще е:
                //90% от бюджета
                //"Cabrio" и "Jeep"
                if (budget <= 100){
                    type= "Economy class"; car = "Jeep";
                    total = budget * 0.65;
                }else if (budget <= 500){
                    type = "Compact class"; car = "Jeep";
                    total = budget * 0.8;
                }else {
                    type = "Luxury class"; car = "Jeep";
                    total = budget * 0.9;
                }
                break;
        }
        //Първи ред – "{Вид на класа}"
        //"Economy class", "Compact class" или "Luxury class"
        //Втори ред – "{Вид на колата} - {цена на колата}"
        //Видът на колата – "Cabrio" или "Jeep"
        //Цената трябва да е форматирана до втория знак след запетаята
        System.out.printf("%s%n", type);
        System.out.printf("%s - %.2f", car, total);
    }
}
