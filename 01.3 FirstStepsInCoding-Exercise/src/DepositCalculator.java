import java.util.Scanner;

public class DepositCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Депозирана сума – реално число в интервала [100.00 … 10000.00]
        //Срок на депозита (в месеци) – цяло число в интервала [1…12]
        //Годишен лихвен процент – реално число в интервала [0.00 …100.00]
        //сума = депозирана сума + срок на депозита * ((депозирана сума * годишен лихвен процент ) / 12)

        double amount = Double.parseDouble(input.nextLine());
        int time = Integer.parseInt(input.nextLine());
        double persent = Double.parseDouble(input.nextLine());

        double lihva = persent/100;
        double month = time/12.0;
        double sum = lihva * amount * month + amount;
        System.out.println(sum);




    }
}

