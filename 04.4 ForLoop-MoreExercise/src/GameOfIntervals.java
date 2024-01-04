import java.util.Scanner;

public class GameOfIntervals {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Първи ред - колко хода ще има по време на играта – цяло число в интервала [1...100]
        //За всеки ход – числата, които се проверяват в кой интервал са – цели числа в интервала [-100...100]
        int turns = Integer.parseInt(input.nextLine());
        double result = 0.0;
        int p1 = 0;
        int p2 = 0;
        int p3 = 0;
        int p4 = 0;
        int p5 = 0;
        int p6 = 0;
        for (int i = 0; i < turns; i++){
            int num = Integer.parseInt(input.nextLine());
            //От 0 до 9  20 % от числото
            //От 10 до 19  30 % от числото
            //От 20 до 29  40 % от числото
            //От 30 до 39  50 точки
            //От 40 до 50  100 точки
            //Невалидно число  резултата се дели на 2
            if (num > 50 || num < 0){
                p6++; result = result / 2.0;
            } else if (num >= 40){
                p5++; result = result + 100;
            }else if (num >= 30){
                p4++; result = result + 50;
            }else if (num >= 20){
                p3++; result = result + num * 0.4;
            }else if (num >= 10){
                p2++; result = result + num * 0.3;
            }else {
                p1++; result = result + num * 0.2;
            }
        }
        //1ви ред: "{Краен резултат}"
        System.out.printf("%.2f",result);
        //2ри ред: "From 0 to 9: {процент в интервала}%"
        System.out.printf("%nFrom 0 to 9: %.2f", p1 * 100.0/turns); System.out.print("%");
        //3ти ред: "From 10 to 19: {процент в интервала}%"
        System.out.printf("%nFrom 10 to 19: %.2f", p2 * 100.0/turns); System.out.print("%");
        //4ти ред: "From 20 to 29: {процент в интервала}%"
        System.out.printf("%nFrom 20 to 29: %.2f", p3 * 100.0/turns); System.out.print("%");
        //5ти ред: "From 30 to 39: {процент в интервала}%"
        System.out.printf("%nFrom 30 to 39: %.2f", p4 * 100.0/turns); System.out.print("%");
        //6ти ред: "From 40 to 50: {процент в интервала}%"
        System.out.printf("%nFrom 40 to 50: %.2f", p5 * 100.0/turns); System.out.print("%");
        //7ми ред: "Invalid numbers: {процент в интервала}%"
        System.out.printf("%nInvalid numbers: %.2f", p6 * 100.0/turns); System.out.print("%");
        //Всички числа трябва да са форматирана до вторият знак след запетаята.
    }
}
