import javax.swing.plaf.synth.SynthUI;
import java.util.Scanner;

public class OperationsBetweenNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //N1 – цяло число в интервала [0...40 000]
        //N2 – цяло число в интервала [0...40 000]
        //Оператор – един символ измеду: "+", "-", "*", "/", "%"
        int n1 = Integer.parseInt(input.nextLine());
        int n2 = Integer.parseInt(input.nextLine());
        String c = input.nextLine();
        double result = 0;

        //Ако операцията е събиране, изваждане или умножение:
        //"{N1} {оператор} {N2} = {резултат} – {even/odd}"
        //Ако операцията е деление:
        //"{N1} / {N2} = {резултат}" – резултатът е форматиран до вторият знак след дес.запетая
        //Ако операцията е деление с остатък:
        //"{N1} % {N2} = {остатък}"
        //В случай на деление с 0 (нула):
        //"Cannot divide {N1} by zero"

             switch (c) {
                 case "+":
                     result = n1 + n2;
                     if (result % 2 == 0) {
                         System.out.printf("%d %s %d = %.0f - even", n1, c, n2, result);
                     } else System.out.printf("%d %s %d = %.0f - odd", n1, c, n2, result);
                     break;
                 case "-":
                     result = n1 - n2;
                     if (result % 2 == 0) {
                         System.out.printf("%d %s %d = %.0f - even", n1, c, n2, result);
                     } else System.out.printf("%d %s %d = %.0f - odd", n1, c, n2, result);
                     break;
                 case "*":
                     result = n1 * n2;
                     if (result % 2 == 0) {
                         System.out.printf("%d %s %d = %.0f - even", n1, c, n2, result);
                     } else System.out.printf("%d %s %d = %.0f - odd", n1, c, n2, result);
                     break;
                 case "/":
                     if (n2 == 0){System.out.printf("Cannot divide %d by zero", n1);}
                     else {result = n1*1.0 / n2; System.out.printf("%d %s %d = %.2f", n1, c, n2, result);}
                     break;
                 case "%":
                     if (n2 == 0){System.out.printf("Cannot divide %d by zero", n1);}
                     else {result = n1 % n2; System.out.printf("%d %s %d = %.0f", n1, c, n2, result);}
                     break;

             }

    }
}
