import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //проверява дали въведеното от потребителя число е в интервала [-100, 100]
        // и е различно от 0
        // извежда "Yes", ако отговаря на условията, или "No" ако е извън тях

        double num = Double.parseDouble(input.nextLine());
        if (num >= -100 && num <= 100 && num != 0){
            System.out.println("Yes");
        } else System.out.println("No");
    }
}
