import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        //Ред 1. Бюджет за филма – реално число в интервала [1.00 … 1000000.00]
        //Ред 2. Брой на статистите – цяло число в интервала [1 … 500]
        //Ред 3. Цена за облекло на един статист – реално число в интервала [1.00 … 1000.00]
        //Декорът за филма е на стойност 10% от бюджета.
        //При повече от 150 статиста, има отстъпка за облеклото на стойност 10%.
        //Ако парите за декора и дрехите са повече от бюджета:
        //"Not enough money!"
        //"Wingard needs {парите недостигащи за филма} leva more."
        //
        //· Ако парите за декора и дрехите са по малко или равни на бюджета:
        // "Action!"
        //"Wingard starts filming with {останалите пари} leva left."

        Scanner input = new Scanner(System.in);

        double budged = Double.parseDouble(input.nextLine());
        int statists = Integer.parseInt(input.nextLine());
        double dress = Double.parseDouble(input.nextLine());

        if (statists > 150){dress = dress * 0.9;}

        budged = budged * 0.9 - statists * dress;

        if (budged >= 0) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", budged);
        } else {
            budged = budged*(-1);
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.",budged);
        }






    }
}
