import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner unput = new Scanner(System.in);
        //Напишете програма, която чете цяло число от конзолата и на всеки следващ ред цели числа
        //докато тяхната сума стане по-голяма или равна на първоначалното число.
        //След приключване на четенето да се отпечата сумата на въведените числа.
        int num1 = Integer.parseInt(unput.nextLine());
        int sum = 0;

        while (sum < num1){
            int num2 = Integer.parseInt(unput.nextLine());
            sum+=num2;
        }
        System.out.println(sum);
    }
}
