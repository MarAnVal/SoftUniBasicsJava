import java.util.Scanner;

public class SafePasswordsGenerator {
    public static void main(String[] args) {
        // генерира тези пароли, разделени една от друга от знака "|".
        //Да се напише програма, която генерира серия от символи като в шаблона:
        //ABxyBA
        //като при всяко генериране на нов код, стойностите на символите се увеличават с 1.
        //Ако A надхвърли 55, се връща на 35. Ако B надхвърли 96, се връща на 64.
        //На първия ред a – цяло число в интервала [1 … 1000]
        //На втория ред b – цяло число в интервала [1 … 1000]
        //На третия ред максимален брой генерирани пароли – цяло число в интервала [1 … 1000000]
        //A е символ с ASCII стойност в диапазона [35… 55]
        //B е символ с ASCII стойност в диапазона [64 … 96]
        //x e цяло число в диапазона [1… a]
        //y e цяло число в диапазона [1… b]
        Scanner input = new Scanner(System.in);
        int xMax = Integer.parseInt(input.nextLine());
        int yMax = Integer.parseInt(input.nextLine());
        int maxPassNumber = Integer.parseInt(input.nextLine());
        int count = 0;
        int a = 35;
        int b = 64;

        for (int x = 1; x <= xMax; x++){
            for (int y = 1; y <= yMax; y++){
                if (count >= maxPassNumber){
                    break;
                }
                count++;
                if (a == 56){
                    a = 35;
                }
                if (b == 97){
                    b = 64;
                }
                System.out.printf("%c%c%d%d%c%c|", a, b, x, y, b, a);
                a++;
                b++;
            }
        }
    }
}
