import java.util.Scanner;

public class BackToThePast {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Наследените пари – реално число в интервала [1.00 ... 1 000 000.00]
        //Годината, до която трябва да живее (включително) – цяло число в интервала [1801 ... 1900]
        double money = Double.parseDouble(input.nextLine());
        int yearLast = Integer.parseInt(input.nextLine());
        //за всяка четна (1800, 1802 и т.н.) година ще харчи 12 000 лева
        //За всяка нечетна (1801,1803  и т.н.) ще харчи 12 000 + 50 * [годините, които е навършил през дадената година].
        double moneyLeft = money;
        for (int i = 1800; i <= yearLast; i++){
            if (i % 2 == 0){
                moneyLeft = moneyLeft - 12000;
            } else
                moneyLeft = moneyLeft - 12000 - 50 * (i - 1800 + 18);
        }
        //Ако парите са достатъчно:
        //"Yes! He will live a carefree life and will have {N} dollars left." – където N са парите, които ще му останат.
        //Ако парите НЕ са достатъчно:
        //"He will need {М} dollars to survive." – където M е сумата, която НЕ достига.
        //форматирана до два знака след десетичната запетая
        if (moneyLeft >= 0){
            System.out.printf("Yes! He will live a carefree life and will have %.2f dollars left.", moneyLeft);
        } else
            System.out.printf("He will need %.2f dollars to survive.", Math.abs(moneyLeft));
    }
}
