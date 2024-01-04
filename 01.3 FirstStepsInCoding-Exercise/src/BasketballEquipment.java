import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        //• Баскетболни кецове – цената им е 40% по-малка от таксата за една година
        //• Баскетболен екип – цената му е 20% по-евтина от тази на кецовете
        //• Баскетболна топка – цената ѝ е 1 / 4 от цената на баскетболния екип
        //• Баскетболни аксесоари – цената им е 1 / 5 от цената на баскетболната топка
        // Годишната такса за тренировки по баскетбол – цяло число в интервала [0… 9999]
        Scanner input = new Scanner(System.in);

        int tax = Integer.parseInt(input.nextLine());

        double sketchers = tax*0.6;
        double outfit = sketchers*0.8;
        double ball = outfit/4;
        double extras = ball/5;
        double total = tax + sketchers + outfit + ball + extras;

        System.out.println(total);


    }
}
