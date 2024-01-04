package exam;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        //На първия ред - цената на тениската – реално число в интервала [1.00 ... 1000.00]
        //На втория ред - сумата, която трябва да достигне, за да спечели топка – реално число в интервала [100.00 ... 10 000.00]
        Scanner input = new Scanner(System.in);
        double tshirtPrice = Double.parseDouble(input.nextLine());
        double target = Double.parseDouble(input.nextLine());
        //ената на шортите е 75% от цената на тениските
        //цената на чорапите е 20% от цената на шортите
        //Бутонките струват два пъти колкото тениската и шортите взети заедно.
        //има карта за отстъпка на стойност 15% от общата сума на покупката.
        //Ако сметката на Пепи е по-висока или равна на дадена сума, той получава подарък – точно копие на топката от световното.
        double shortsPrice = tshirtPrice * 0.75;
        double socksPrice = shortsPrice * 0.20;
        double shouesPrice = (tshirtPrice + shortsPrice) * 2;
        double total = tshirtPrice + shortsPrice + socksPrice + shouesPrice;
        total *= 0.85;
        if (total >= target){
            //Ако топката Е спечелена:
            //"Yes, he will earn the world-cup replica ball!"
            //"His sum is {сумата} lv."
            //Резултатът да бъде форматиран до втората цифра след десетичната запетая.
            System.out.printf("Yes, he will earn the world-cup replica ball!%nHis sum is %.2f lv.", total);
        } else {
            //Ако  топката НЕ Е спечелена:
            //"No, he will not earn the world-cup replica ball."
            //"He needs {недостигащи пари} lv. more."
            //Резултатът да бъде форматиран до втората цифра след десетичната запетая.
            System.out.printf("No, he will not earn the world-cup replica ball.%nHe needs %.2f lv. more.", Math.abs(total-target));
        }
    }
}
