import java.util.Scanner;

public class MaxNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //до получаване на командата "Stop", чете цели числа, въведени от потребителя
        //намира най-голямото измежду тях.
        //Въвежда се по едно число на ред
        String num = input.nextLine();
        int max = Integer.MIN_VALUE;

        while (!num.equals("Stop")){
            int num1 = Integer.parseInt(num);
            if (num1 >= max){
                max = num1;
            }

            num = input.nextLine();
        }
        System.out.println(max);
    }
}
