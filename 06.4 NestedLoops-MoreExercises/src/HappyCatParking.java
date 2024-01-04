import java.util.Scanner;

public class HappyCatParking {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Брой дни – цяло число в интервала [1 … 5]
        //Брой часове за всеки един от дните - цяло число в интервала [1 … 24]
        int days = Integer.parseInt(input.nextLine());
        int houers = Integer.parseInt(input.nextLine());

        double total = 0;
        //За всеки четен ден и нечетен час, паркингът таксува 2.50 лева.
        //Във всеки нечетен ден и четен час таксата е 1.25 лева,
        //във всички останали случаи се заплаща 1 лев.
        //Таксуването става на всеки изминал час от деня.
        //Всеки един от изходите трябва да бъде закръглен до втория знак след десетичната запетая.
        for (int i = 1; i <= days; i++){
            double daySum = 0;
            for (int j = 1; j <= houers; j++){
                if (i % 2 == 0 && j % 2 != 0){
                    daySum += 2.5;
                } else if (i % 2 != 0 && j % 2 == 0){
                    daySum += 1.25;
                } else {
                    daySum++;
                }
            }
            total+=daySum;
            System.out.printf("Day: %d - %.2f leva%n", i, daySum);
        }
        System.out.printf("Total: %.2f leva", total);
        //За всеки изминал ден, общата сума, която трябва да се плати – "Day: {индексът на деня} – {общата сума за деня} leva"
        //Когато програмата приключи - "Total: {общата сума за всички дни} leva"
    }
}
