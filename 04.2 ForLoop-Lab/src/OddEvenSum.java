import java.util.Scanner;

public class OddEvenSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sum1 = 0;
        int sum2 = 0;

        for (int i = 0; i < n; i++){
            int num = Integer.parseInt(input.nextLine());
            if (i % 2 == 0){
                sum1 = sum1 + num;
            } else sum2 = sum2 + num;
        }
        if (sum1 == sum2){
            System.out.printf("Yes%nSum = %d",sum1);
        } else System.out.printf("No%nDiff = %d", Math.abs(sum1 - sum2));
    }
}