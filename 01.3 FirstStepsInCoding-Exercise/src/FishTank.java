import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        //1. Дължина в см – цяло число в интервала [10 … 500]
        //2. Широчина в см – цяло число в интервала [10 … 300]
        //3. Височина в см – цяло число в интервала [10… 200]
        //4. Процент – реално число в интервала [0.000 … 100.000]
        //Един литър вода се равнява на един кубичен дециметър/ 1л=1 дм 3
        Scanner input = new Scanner(System.in);

        int a = Integer.parseInt(input.nextLine());
        int b = Integer.parseInt(input.nextLine());
        int c = Integer.parseInt(input.nextLine());
        double full = Double.parseDouble(input.nextLine());

        double tank = a * b * c /1000.00;
        double total = tank * (100-full)/100;

        System.out.println(total);





    }
}
