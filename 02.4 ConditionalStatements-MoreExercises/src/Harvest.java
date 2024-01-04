import java.util.Scanner;

public class Harvest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //От лозе с площ X квадратни метри се заделя 40% от реколтата за производство на вино.
        // От 1 кв.м лозе се изкарват Y килограма грозде.
        // За 1 литър вино са нужни 2,5 кг. грозде.
        // Желаното количество вино за продан е Z литра.
        //1ви ред: X кв.м е лозето – цяло число в интервала [10 … 5000]
        //2ри ред: Y грозде за един кв.м – реално число в интервала [0.00 … 10.00]
        //3ти ред: Z нужни литри вино – цяло число в интервала [10 … 600]
        //4ти ред: брой работници – цяло число в интервала [1 … 20]
        //Ако произведеното вино е по-малко от нужното:
        //“It will be a tough winter! More {недостигащо вино} liters wine needed.”
        //Резултатът трябва да е закръглен към по-ниско цяло число
        //Ако произведеното вино е колкото или повече от нужното:
        //“Good harvest this year! Total wine: {общо вино} liters.”
        //Резултатът трябва да е закръглен към по-ниско цяло число
        //“{Оставащо вино} liters left -> {вино за 1 работник} liters per person.”
        //И двата резултата трябва да са закръглени към по-високото цяло число

        int fieldDec = Integer.parseInt(input.nextLine());
        double grapePerDec = Double.parseDouble(input.nextLine());
        int neededWine = Integer.parseInt(input.nextLine());
        int workersCount = Integer.parseInt(input.nextLine());

        double grapeAll = fieldDec * grapePerDec;
        double wine = grapeAll * 0.4/ 2.5;

        if (neededWine > wine){
            double needed = Math.floor(neededWine-wine);
            System.out.printf("It will be a tough winter! More %.0f liters wine needed.", needed);
        } else {
            double needed = Math.ceil(wine - neededWine);
            double extra = Math.ceil(needed/workersCount);
            System.out.printf("Good harvest this year! Total wine: %.0f liters.%n", Math.floor(wine));
            System.out.printf("%.0f liters left -> %.0f liters per person.", needed, extra);
        }



    }
}
