import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //На всеки ред ще получавате сумата, която трябва да внесете в сметката, до получаване на команда "NoMoreMoney ".
        //При всяка получена сума на конзолата трябва да се извежда "Increase: " + сумата и тя да се прибавя в сметката.
        //Ако получите число по-малко от 0 на конзолата трябва да се изведе "Invalid operation!" и програмата да приключи.
        //Изход "Total: " + общата сума в сметката форматирана до втория знак след десетичната запетая.
        String deposit = input.nextLine();
        double total = 0.00;
        while(!deposit.equals("NoMoreMoney")){
            double sum = Double.parseDouble(deposit);

            if (sum >0){
                total += sum;
                System.out.printf("%nIncrease: %.2f",sum);
                deposit = input.nextLine();
            } else {
                System.out.printf("%nInvalid operation!");
                break;
            }

        }
        System.out.printf("%nTotal: %.2f",total);

    }
}

