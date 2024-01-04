import java.util.Scanner;

public class MinNumber {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String num = input.nextLine();
        int min = Integer.MAX_VALUE;

        while (!num.equals("Stop")){
            int num1 = Integer.parseInt(num);
            if (num1 <= min){
                min = num1;
            }

            num = input.nextLine();
        }
        System.out.println(min);
    }
}
