import java.util.Scanner;

public class SumPrimeNonPrime {
    public static void main(String[] args) {
        //чете от конзолата цели числа в диапазона, докато не се получи команда "stop".
        //Да се намери сумата на всички въведени прости и сумата на всички въведени непрости числа.
        //Тъй като по дефиниция от математиката отрицателните числа не могат да бъдат прости,
        //ако на входа се подаде отрицателно число да се изведе следното съобщение "Number is negative.".
        //В този случай въведено число се игнорира и не се прибавя към нито една от двете суми,
        //а програмата продължава своето изпълнение, очаквайки въвеждане на следващо число.
        Scanner input = new Scanner(System.in);
        String text = input.nextLine();
        int primeSum = 0;
        int notPrimeSum = 0;
        int flag = 0;

        while (!text.equals("stop")){
            int number = Integer.parseInt(text);
            for (int i = 1; i <= Math.abs(number); i++) {
                if (number < 0) {
                    System.out.printf("Number is negative.%n");
                    break;
                } else if (number % i == 0) {
                    flag++;
                    if (flag > 2){
                        notPrimeSum += number;
                        flag = 0;
                        break;
                    } else if (i == number){
                        primeSum += number;
                    }

                }
            }
            text = input.nextLine();
            flag = 0;
        }
        //На изхода да се отпечатат на два реда двете намерени суми в следния формат:
        //"Sum of all prime numbers is: {prime numbers sum}"
        //"Sum of all non prime numbers is: {nonprime numbers sum}"
        System.out.printf("Sum of all prime numbers is: %d%n", primeSum);
        System.out.printf("Sum of all non prime numbers is: %d", notPrimeSum);
    }
}
