import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        //връщат възможно най-малко монети ресто.
        //Напишете програма, която приема сума - рестото, което трябва да се върне
        //и изчислява с колко най-малко монети може да стане това.
        Scanner input = new Scanner(System.in);
        double change = Double.parseDouble(input.nextLine());
        int money = (int) (change*100);
        int coins = 0;
            coins = money / 200;
            money %= 200;
            coins += money / 100;
            money %= 100;
            coins += money / 50;
            money %= 50;
            coins += money / 20;
            money %= 20;
            coins += money / 10;
            money %= 10;
            coins += money /5;
            money %= 5;
            coins += money / 2;
            money %= 2;
            coins += money;

        System.out.printf("%d", coins);

    }
}
