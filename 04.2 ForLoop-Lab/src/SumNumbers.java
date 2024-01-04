import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int sum = 0;
        for(int i = 0; i < n ; i++){
            int num = Integer.parseInt(input.nextLine());
            sum = sum + num;
        }
        System.out.println(sum);
    }
}
