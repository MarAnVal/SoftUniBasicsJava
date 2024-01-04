import java.util.Scanner;

public class PoolDay {
    public static void main(String[] args) {
        //1. Първи ред – брой на хората. Цяло число в интервала [1…100]
        //2. Втори ред – такса вход. Реално число в интервала [0.00…50.00]
        //3. Трети ред – цена един за шезлонг. Реално число в интервала [0.00…50.00]
        //4. Четвърти ред – цена за един чадър. Реално число в интервала [0.00...50.00]
        // един чадър стига за двама души.
        // Знае се, че само 75% от екипа искат шезлонги.
        // При изчислението на броя на чадърите и шезлонгите, техният брой да се закръгли до по-голямото цяло число.
        Scanner input = new Scanner(System.in);
        int ppl = Integer.parseInt(input.nextLine());
        double fee = Double.parseDouble(input.nextLine());
        double shezlongFee = Double.parseDouble(input.nextLine());
        double umbrelaFee = Double.parseDouble(input.nextLine());

        int shezlongNum = (int) Math.ceil(ppl * 0.75);
        int umbrelaNum = (int) Math.ceil(ppl/2.0);
        double total = ppl * fee + shezlongFee * shezlongNum + umbrelaFee * umbrelaNum;

        //"{сумата за покриване на разходите} lv."
        //Резултатът да се форматира до втората цифра след десетичния знак.
        System.out.printf("%.2f lv.", total);
    }
}
