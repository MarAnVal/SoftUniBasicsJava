import java.util.Scanner;

public class NumberSequence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = Integer.parseInt(input.nextLine());
        int max = 0;
        int min = 0;
        for (int i = 0; i < n ; i++){
            int num = Integer.parseInt(input.nextLine());
            if (i == 0){
                max = num; min = num;
            }else if (max < num){
                max = num;
            } else if (min > num){
                min = num;
            }
        }
        System.out.printf("Max number: %d", max);
        System.out.printf("%nMin number: %d", min);
    }
}
